package com.techment.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.Entity.LoanApplication;
import com.techment.exception.LoanApplicationAlreadyExistException;
import com.techment.exception.LoanApplicationNotFoundException;
import com.techment.service.ILoanApplicationService;

@RestController
@RequestMapping("/api/v1")
public class LoanApplicationController {
	
	@Autowired
	private ILoanApplicationService loanApplicationService;
	
	@PostMapping("/saveLoan")
	public ResponseEntity<LoanApplication> saveLoan(@RequestBody LoanApplication loanApplication){
		
	try {
		return new ResponseEntity<LoanApplication>(loanApplicationService.saveLoanApplication(loanApplication), HttpStatus.CREATED);
	} catch (Exception e) {
		throw new LoanApplicationAlreadyExistException("Already Loan Exist");
	}
	}
	
	@PutMapping("/approveLoan/{id}")
	public ResponseEntity<LoanApplication> approveLoan(@PathVariable int id)
	{
		try {
		return new ResponseEntity<LoanApplication>(loanApplicationService.approveLoanApplication(id),HttpStatus.OK);
	}
		catch(NoSuchElementException e)
		{
			throw new LoanApplicationNotFoundException("no loan present with this id");
		}
	}
	
	@PutMapping("/rejectLoan/{id}")
	public ResponseEntity<LoanApplication> rejectLoan(@PathVariable int id)
	{
		try {
		return new ResponseEntity<LoanApplication>(loanApplicationService.approveLoanApplication(id),HttpStatus.OK);
	}
		catch(NoSuchElementException e)
		{
			throw new LoanApplicationNotFoundException("no loan present with this id");
		}
	}

	
	
	
}
