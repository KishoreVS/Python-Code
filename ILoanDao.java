package com.capgemini.xyz.dao;

import java.util.Map;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Customer.Loan;

public interface ILoanDao {
private Map<Integer,Customer> customerEntry;
private Map<Integer,Loan> loanEntry;
public long applyLoan(Loan loan) ;
public long insertcust(Customer cust);
}
