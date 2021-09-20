package com.techment.dao;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsernameAndPassword(String username, String password);
}
