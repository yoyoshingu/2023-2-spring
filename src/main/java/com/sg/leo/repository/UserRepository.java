package com.sg.leo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sg.leo.domain.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

}
