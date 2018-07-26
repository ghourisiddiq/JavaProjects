package com.deloitte.main;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
	
public class Assignment3 {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
				
				a1.add("C");
				a1.add("A");
				a1.add("E");
				a1.add("B");
				a1.add("D");
				a1.add("F");
				
				System.out.print("Original Contents OF a1: ");	
				
				Iterator<String> itr = a1.iterator();
				while(itr.hasNext()) {
					String element = itr.next();
					System.out.print(element + " ");
				}
				System.out.println();
				
				// Modify objects being iterated. 
			   ListIterator<String> litr = a1.listIterator();
			    while(litr.hasNext()) { 
			      String element = litr.next(); 
			      litr.add(element + "+"); 
			    } 
			 
			    System.out.print("Modified contents of al: "); 
			    itr = a1.iterator();  
			    while(itr.hasNext()) { 
			      String element = itr.next(); 
			      System.out.print(element + " "); 
			    } 
			    System.out.println(); 
			 
			    // Now, display the list backwards. 
			    System.out.print("Modified list backwards: "); 
			    while(litr.hasPrevious()) { 
			      String element = litr.previous(); 
			      System.out.print(element + " "); 
			    } 
			    System.out.println();
} 
}