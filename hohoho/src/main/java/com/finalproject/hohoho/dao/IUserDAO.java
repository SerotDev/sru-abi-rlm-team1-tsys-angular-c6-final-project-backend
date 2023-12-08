package com.finalproject.hohoho.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.hohoho.dto.User;

public interface IUserDAO extends JpaRepository <User, Integer> {
	User findByName(String name);
}
