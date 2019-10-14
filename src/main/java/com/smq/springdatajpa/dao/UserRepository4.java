package com.smq.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.smq.springdatajpa.model.User;

public interface UserRepository4 extends JpaRepository<User, Integer>,JpaSpecificationExecutor<User>,UserDao{

}
