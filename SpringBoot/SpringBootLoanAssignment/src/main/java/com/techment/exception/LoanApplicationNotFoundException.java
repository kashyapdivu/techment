package com.techment.exception;

public class LoanApplicationNotFoundException extends RuntimeException{
	

	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LoanApplicationNotFoundException() {
		super();
	}

	public LoanApplicationNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	

}
