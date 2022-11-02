package com.UST.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UST.api.model.User;

public interface UserRepo extends JpaRepository<User,Integer> {

}
