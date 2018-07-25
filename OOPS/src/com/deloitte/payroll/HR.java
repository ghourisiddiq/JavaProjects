package com.deloitte.payroll;

public class HR {
	public Employee recruit(String etype) {
		Employee employee = null;
		if(etype.equals("I")) {
			employee = new Interns();
			
		}else if(etype.equals("P")) {
			employee = new ConfirmedEmployee();
			
		}else if(etype.equals("C")) {
			employee = new ContractEmployee();
			
		}
		return employee;
	}
}
