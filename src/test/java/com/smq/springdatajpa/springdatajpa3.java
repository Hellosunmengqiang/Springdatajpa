package com.smq.springdatajpa;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

import com.smq.springdatajpa.dao.UserRepository3;
import com.smq.springdatajpa.model.User;


public class springdatajpa3 {
	
	@Test
	public void test() {
		ApplicationContext context=new ClassPathXmlApplicationContext("springdatajpa.xml");
				
		UserRepository3 us=context.getBean(UserRepository3.class);
		
		int page=1;
		int size=5;
	    PageRequest pageable=PageRequest.of(page-1, size,Direction.DESC,"id");//页码从0开始，也就是pge-1=0，就是第1页，降序按照id
	    
	    Page<User> pager=us.findAll(pageable);
	    System.out.println(pager.getContent());//分页的数据
	    System.out.println(pager.getNumber()+1);//当前页码
	    System.out.println(pager.getNumberOfElements());// 当前页码的真实页码条数
	    System.out.println(pager.getSize());
	    System.out.println(pager.getTotalElements());
	}

}
