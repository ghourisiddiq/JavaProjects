package com.deloitte.daos;

public class User {
   private int id;
   private String username;
   private String firstname;
   private String lastname;
   private String passwd;
   private String status;
   
   
   public User( int id, String username, String firstname, String lastname, String passwd, String status) {
	   this.setId(id);
	   this.setUsername(username);
	   this.setFirstName(firstname);
	   this.setLastName(lastname);
	   this.setPasswd(passwd);
	   this.setStatus(status);
	   
   }


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}


public String getFirstName() {
	return firstname;
}


public void setFirstName(String firstname) {
	this.firstname = firstname;
}


public String getLastName() {
	return lastname;
}


public void setLastName(String lastname) {
	this.lastname = lastname;
}


public String getPasswd() {
	return passwd;
}


public void setPasswd(String passwd) {
	this.passwd = passwd;
}


public String isStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}
}
