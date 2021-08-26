package com.techment.day6.customeexception;




public class InSufficientFundException extends RuntimeException {

	String msg;

	public InSufficientFundException(String msg) {
		super();
		this.msg = msg;
	}

}
