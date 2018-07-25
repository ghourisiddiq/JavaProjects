package com.deloitte.payroll.main;

import java.util.Scanner;

import com.deloitte.payroll.Accounts;
import com.deloitte.payroll.ConfirmedEmployee;
import com.deloitte.payroll.ContractEmployee;
import com.deloitte.payroll.Employee;
import com.deloitte.payroll.HR;
import com.deloitte.payroll.Interns;

public class MainClass {
	public static void main(String[] args) {
		ConfirmedEmployee confirmedEmployee = new ConfirmedEmployee();
		Interns intern = new Interns();
		ContractEmployee contractEmployee = new ContractEmployee();
		Accounts accounts = new Accounts();
		
		accounts.processSalary(confirmedEmployee);
		accounts.processSalary(intern);
		accounts.processSalary(contractEmployee);
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee type: ");
		String etype = sc.nextLine();
		
		Employee e;
		HR hr = new HR();
		e = hr.recruit(etype);
		
		accounts.processSalary(e);
		
	}
}
