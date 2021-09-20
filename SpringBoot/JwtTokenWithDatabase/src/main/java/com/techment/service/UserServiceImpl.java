package com.techment.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.IUserRepository;
import com.techment.dto.UserDto;
import com.techment.entity.User;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserRepository repository;

	@Override
	public UserDto login(String username, String password) throws NoSuchElementException{
			User user = repository.findByUsernameAndPassword(username, password).get();
			UserDto userDto = new UserDto(user.getUsername(), user.getPassword(), "myToken");
		return userDto;
	}
}
