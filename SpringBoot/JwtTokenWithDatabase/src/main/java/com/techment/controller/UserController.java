package com.techment.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.UserDto;
import com.techment.entity.User;
import com.techment.exception.InvalidUserException;
import com.techment.service.IUserService;

@RestController
@RequestMapping(value = "/")
public class UserController {

	@Autowired
	IUserService service;
	
	@PostMapping("/login")
	public ResponseEntity<UserDto> login(@RequestBody User user) throws InvalidUserException
	{
		try
		{
		UserDto userDto = service.login(user.getUsername(), user.getPassword());
		return new ResponseEntity<UserDto>(userDto, HttpStatus.OK);
		}catch(NoSuchElementException e)
		{
			throw new InvalidUserException("Username or Password is incorrect.");
		}
	}
}
