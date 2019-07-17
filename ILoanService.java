package com.capgemini.xyz.service;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Customer.Loan;

public interface ILoanService {
 public long applyLoan(Loan loan);
 public Customer validateCustomer(Customer customer);
 public long insertcust(Customer cust);
 public double calculateEMI(double amount,int duration);
}
