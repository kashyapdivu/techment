package com.techment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	
	@ExceptionHandler(value=LoanApplicationAlreadyExistException.class)
	public ResponseEntity<String> myException(LoanApplicationAlreadyExistException exception)
	{
		return new ResponseEntity<String>(exception.getMsg(), HttpStatus.CONFLICT);
	}
	

	@ExceptionHandler(value=LoanApplicationNotFoundException.class)
	public ResponseEntity<String> myException(LoanApplicationNotFoundException exception)
	{
		return new ResponseEntity<String>(exception.getMsg(), HttpStatus.NOT_FOUND);
	}
}
