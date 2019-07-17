package com.capgemini.xyz.ui;
import java.util.Random;
import java.util.Scanner;
import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.service.LoanService;
public class ExecuterMain {
public static void main(String[] args) {
	LoanService service=new LoanService();
	long custId = 0;
	String custname;
	String address;
    long mobile;
	 String email;
	while(true) {
		System.out.println("********XYZ Finance Company Welcomes You***********");
		System.out.println("1.Register Customer");
		System.out.println("2.Exit");
		System.out.println("enter ur choice");
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		switch(d) {
		case 1:
			System.out.println("enter Customer name");
			custname=sc.next();
			System.out.println("enter address");
			address=sc.next();
			System.out.println("enter mobile");
			mobile=sc.nextLong();
			System.out.println("enter email");
			email=sc.next();
			for(int i=0;i<6;i++) {
				custId=custId+(int)(Math.random()*10);
			}
			Customer a=new  Customer(custId,custname,address,mobile,email);
			long a1=service.insertcust(a);
			System.out.println("customer information saved successfully");
			System.out.println("Your CustomerId is"+a1);
			
		case 2:
			System.exit(0);
			break;
			
		
	}}}
}