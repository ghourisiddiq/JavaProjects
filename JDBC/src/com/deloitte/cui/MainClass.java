package com.deloitte.cui;

import com.deloitte.daos.User;
import com.deloitte.daos.UserDao;

public class MainClass {

	public static void main(String[] args) {
		UserDao udao = new UserDao();
	    User user = new User(1, "sidghouri", "Siddiq", "Ghouri", "pass#123", "E");
	    
	    udao.save(user);
	

	}

}
