package com.smq.springdatajpa.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;

import com.smq.springdatajpa.model.User;

@RepositoryDefinition(domainClass=User.class,idClass=Integer.class)
public interface UserRepository{
	
	public User getById(int id);

	
	public User getByIdAndUsernameAndPasword(int id,String username,String pasword);
	
	//<=2
	public List<User> getByIdLessThanEqual(int id);
	
	public List<User> getByUsernameLike(String str);//"%aa%"
	
	public List<User> getByUsernameContaining(String str); //"aa"
	
	public List<User> getByAddress_AddressInfo(String info);  //关联查询
	
	//找出User表里最大的id
	@Query("select u from User u where u.id=(select max(uu.id) from User uu)")
	public User getMaxIdUser();
	
	@Query("select u from User u where u.username=?1 and u.pasword=?2")
	public User getByUP(String user,String psword);
	
	//带有%aa%的模糊查询
	@Query("select u from User u where u.username like %?1%")
	public List<User> getUsersByLike(String str);
	
	
	@Query(value="select * from t_user",nativeQuery=true)//原生的sql语句查询
	public List<User> getAllUsers();
	
	//update and delete 必须在userService接口里实现,Modifying实现的，但是不能实现insert
	@Modifying
	@Query("update User u set u.username=?1 where u.id=?2")
	public void updateUserById(String username,int id);
	
	@Modifying
	@Query("delete from User u where u.id=?1")
	public void deleteUserById(int id);
}
