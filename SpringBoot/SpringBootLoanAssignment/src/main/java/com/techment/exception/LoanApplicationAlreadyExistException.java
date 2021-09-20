package com.techment.exception;

public class LoanApplicationAlreadyExistException extends RuntimeException{


	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LoanApplicationAlreadyExistException() {
		super();
	}

	public LoanApplicationAlreadyExistException(String msg) {
		super();
		this.msg = msg;
	}
	
	
	
	

	
	
}
