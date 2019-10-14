package com.smq.springdatajpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.smq.springdatajpa.model.User;

public class UserRepository4Impl implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public User mytest(int id) {
		// TODO 自动生成的方法存根
		User user=entityManager.find(User.class, 1);
		return user;
	}

}
