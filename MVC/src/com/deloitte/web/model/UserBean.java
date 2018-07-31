package com.deloitte.web.model;

import java.io.Serializable;

public class UserBean implements Serializable {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean authenticate (String uname, String passwd){
		if (uname != "null" && passwd != "null") {
			if (uname.equalsIgnoreCase("Siddiq") && passwd.equals("pass123")) {
				firstName="Siddiq";
				lastName="Ghouri";		
				return true;
			} else {
				return false;
			}	
		}
		return false;
	}
	
}
