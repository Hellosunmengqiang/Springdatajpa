package com.smq.springdatajpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smq.springdatajpa.dao.UserRepository;
import com.smq.springdatajpa.model.User;
import com.smq.springdatajpa.service.UserService;

public class springdatajpa {
	
	@Test
	public void test() {
		ApplicationContext context=new ClassPathXmlApplicationContext("springdatajpa.xml");
		
		//UserRepository userRepository=context.getBean(UserRepository.class);
	     //User user=userRepository.getById(1);
		//User user2=userRepository.getByIdAndUsernameAndPasword(1, "admin", "123");
		
		//List<User> user=userRepository.getByIdLessThanEqual(2);
		//List<User> user=userRepository.getByUsernameLike("%aa%");
		
		//List<User> user=userRepository.getByUsernameContaining("a");
		//List<User> user=userRepository.getByAddress_AddressInfo("xxx");
		
		//User user=userRepository.getMaxIdUser();
		//User user=userRepository.getByUP("admin", "123");
		
		//List<User> user=userRepository.getUsersByLike("a");
		
		//List<User> user=userRepository.getAllUsers();
				
	    //System.out.println(user);
		
		
		UserService userService=context.getBean(UserService.class);
		//userService.updateUserById("zs", 1);		
	      userService.deleteUserById(4); 
		
	}

}
