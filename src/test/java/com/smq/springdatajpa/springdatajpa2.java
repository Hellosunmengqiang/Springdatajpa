package com.smq.springdatajpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smq.springdatajpa.dao.UserRepository2;
import com.smq.springdatajpa.model.User;


public class springdatajpa2 {
	
	@Test
	public void test() {
		ApplicationContext context=new ClassPathXmlApplicationContext("springdatajpa.xml");
				
		UserRepository2 us=context.getBean(UserRepository2.class);
		 List<User> users=new ArrayList<>();
		 
		for(int i=1;i<=30;i++)
		{
			User user=new User();
			user.setUsername("aa"+i+i);
			user.setPasword("123"+i);
			user.setAddress(null);
			user.setRegDate(new Date());
			users.add(user);
		}
		us.saveAll(users);
	}

}
