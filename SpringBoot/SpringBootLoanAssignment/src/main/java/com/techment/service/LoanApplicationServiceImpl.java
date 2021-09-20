package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.Entity.LoanApplication;
import com.techment.exception.LoanApplicationAlreadyExistException;
import com.techment.exception.LoanApplicationNotFoundException;
import com.techment.repository.LoanApplicationRepository;

@Service
public class LoanApplicationServiceImpl implements ILoanApplicationService {

	@Autowired
	LoanApplicationRepository loanApplicationRepository;
	
	@Override
	public LoanApplication saveLoanApplication(LoanApplication loanApplication) throws LoanApplicationAlreadyExistException{
		loanApplicationRepository.save(loanApplication);
		
		return loanApplication;
	}

	@Override
	public LoanApplication approveLoanApplication(int loanId) throws LoanApplicationNotFoundException {
		LoanApplication loanApplication=loanApplicationRepository.findById(loanId).get();
		loanApplication.setStatus("Approved");
		loanApplicationRepository.save(loanApplication);
		return loanApplication;
	}

	@Override
	public LoanApplication rejectLoanApplication(int loanId) throws LoanApplicationNotFoundException{
		LoanApplication loanApplication=loanApplicationRepository.findById(loanId).get();
		loanApplication.setStatus("rejected");
		loanApplicationRepository.save(loanApplication);
		return loanApplication;
	}

}
