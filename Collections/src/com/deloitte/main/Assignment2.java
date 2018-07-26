package com.deloitte.main;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
	
public class Assignment2 {
	
	public static void main(String[] args) {
		
		       LinkedList<String> adq = new LinkedList<String>();
				
		        adq.push("A");
				adq.push("B");
				adq.push("D");
				adq.push("E");
				adq.push("F");
				
				System.out.println("Popping the stack");	
				
				while(adq.peek() != null)
					System.out.println(adq.pop()+" ");
				
			System.out.println( );
			
	}
			
		
	}

