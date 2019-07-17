package com.capgemini.xyz.bean;

public class Customer {
	private long custId;
	private String custname;
	private String address;
	private long mobile;
	private String email;
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Customer(long custId, String custname, String address, long mobile, String email) {
		super();
		this.custId = custId;
		this.custname = custname;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}

	public class Loan{
		private long loanId;
		private double loanAmount;
		private long custId;
		private int duration;
		public long getLoanId() {
			return loanId;
		}
		public void setLoanId(long loanId) {
			this.loanId = loanId;
		}
		public double getLoanAmount() {
			return loanAmount;
		}
		public void setLoanAmount(double loanAmount) {
			this.loanAmount = loanAmount;
		}
		public long getCustId() {
			return custId;
		}
		public void setCustId(long custId) {
			this.custId = custId;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		public Loan(long loanId, double loanAmount, long custId, int duration) {
			super();
			this.loanId = loanId;
			this.loanAmount = loanAmount;
			this.custId = custId;
			this.duration = duration;
		}
		
	}

}
