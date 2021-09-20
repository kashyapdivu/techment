package com.techment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.Entity.LoanApplication;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Integer>{

}
