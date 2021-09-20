package com.techment.service;

import com.techment.Entity.LoanApplication;
import com.techment.exception.LoanApplicationAlreadyExistException;
import com.techment.exception.LoanApplicationNotFoundException;

public interface ILoanApplicationService {
	
	LoanApplication saveLoanApplication(LoanApplication loanApplication) throws LoanApplicationAlreadyExistException;
	LoanApplication approveLoanApplication(int loanId) throws LoanApplicationNotFoundException;
	LoanApplication rejectLoanApplication(int loanId) throws LoanApplicationNotFoundException;
	

}
