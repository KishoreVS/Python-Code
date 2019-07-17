package com.capgemini.xyz.service;

import java.util.Scanner;


import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Customer.Loan;
import com.capgemini.xyz.dao.LoanDao;

public class LoanService implements ILoanService{
	Scanner sc = new Scanner(System.in);
   LoanDao pd = new LoanDao();
	public long applyLoan(Loan loan) {
		return 0;
		
	}
	public Customer validateCustomer(Customer customer) {
		return customer;
		
	}
	 public long insertcust(Customer a) {
		 long pb = pd.insertcust(a);
			return pb;
	
		 
	 }
	 public double calculateEMI(double amount,int duration) {
		return duration;
		 
	 }
}
