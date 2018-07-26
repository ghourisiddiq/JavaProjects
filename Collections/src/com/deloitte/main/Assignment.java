package com.deloitte.main;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
	
public class Assignment {
	
	public static void main(String[] args) {
		
		       LinkedList<String> result = new LinkedList<String>();
				
				result.add("B");
				result.add("C");
				result.add("D");
				result.add("X");
				result.add("Y");
				result.addLast("Z");
				result.addFirst("A");
				
				result.add(1, "A2");
				
				System.out.println("Original Contents: "+result);	
				
				result.remove("F");
				result.remove(2);
				
				System.out.println("Contents after deletion: "+result);
				
				result.removeFirst();
				result.removeLast();
				
				System.out.println("Contents after deletion First and Last: "+result);
				
				String val = result.get(2);
				result.set(2, val+" changed");
				System.out.println("Contents after Change: "+result);
			}
			
		
	}

