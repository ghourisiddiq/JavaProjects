package com.deloitte.emp;

public class EmployeeBo {
	
	public void calincomeTax(EmployeeVo emp) {
		double ai;
		ai = emp.getAnnualincome();
		double tax =0;
		if(ai >= 1000000 && ai <= 500000) {
			tax = 0.1*ai;
		}
		if(ai >= 500000 && ai <= 300000) {
			tax = 0.05*ai;
		}
		else
			tax = 0.02*ai;
		 emp.setIncometax(tax);
	}
}