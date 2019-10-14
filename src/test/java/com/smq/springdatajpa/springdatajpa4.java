package com.smq.springdatajpa;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.smq.springdatajpa.dao.UserRepository4;
import com.smq.springdatajpa.model.User;


public class springdatajpa4 {
	
	@Test
	public void test() {
		ApplicationContext context=new ClassPathXmlApplicationContext("springdatajpa.xml");
				
		UserRepository4 us=context.getBean(UserRepository4.class);
		
		/*1.接口：JpaRepository<User, Integer>
		 * User user=new User();
		user.setUsername("ls");
		user.setPasword("1234");
	    user.setId(34);
	    us.saveAndFlush(user);*/
		
		/*2.接口：JpaSpecificationExecutor<User>
		 * Specification<User> spec=new Specification<User>() {

			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				// TODO 自动生成的方法存根
				
				Path<Integer> path=root.get("id");
				Predicate predicate=criteriaBuilder.greaterThan(path, 33);
				return predicate;
			}
		};
		
		List<User> users=us.findAll(spec);
		System.out.println(users);*/
		
		/*
		 * 3.自定义接口实现UserDao
		 */
		User user=us.mytest(1);
		System.out.println(user);
	}

}
