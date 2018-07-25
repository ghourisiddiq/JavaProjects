package com.deloitte.payroll;

public class Accounts {
	
	public void processSalary(Employee employee){
		if(employee!=null) {
		if(employee instanceof ConfirmedEmployee) {
			//ConfirmedEmployee confirmedEmployee = (ConfirmedEmployee)employee;
			((ConfirmedEmployee) employee).transport();
		}
		employee.netSalary();
	}
	
	}	
}
