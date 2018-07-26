package com.deloitte.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

class Address {
      private String name;
      private String street;
      private String city;
      private String state;
      private String code;
      private int id;
      
      Address(String n, String s, String c, String st, String cd){
    	  name = n;
    	  street = s;
    	  city = c;
    	  state = st;
    	  code = cd;
      }
      
      public String toString() {
    	  return name + "\n" + street + "\n" + city +" "+ state + " " + code;
      }
      
      @Override
    public boolean equals(Object obj) {
    	Address casted =(Address) obj;
    	if(this.name == casted.name && this.street == casted.street && this.city == casted.city && this.state == casted.state && this.code == casted.code)
    		return true;
    	else return false;
    	
    }
      @Override
    public int hashCode() {
    	return this.id;
    }
}

public class MailList {

	public static void main(String[] args) {
    HashSet<Address> m1 = new HashSet<Address>();
		 
         m1.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
		 m1.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahome", "IL", "61853"));
		 m1.add(new Address("Tom Carlton", "867 Elm Street", "Champaign", "IL", "61820"));
		 m1.add(new Address("Tom Carlton", "867 Elm Street", "Champaign", "IL", "61820"));
		 
	
		 System.out.println("ADDRESSES:");
		 
		 Iterator<Address> itr = m1.iterator();
		 while(itr.hasNext()) {
			 Address element = itr.next(); 
		      System.out.print(element + " "); 
		      System.out.println();
		      System.out.println();
		      
		     }
		 }
	}


