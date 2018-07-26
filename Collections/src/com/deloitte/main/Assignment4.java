package com.deloitte.main;

import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

public class Assignment4 {
	public static void main(String[] args) {

// initial size of 3 and increment of 2 
Vector<Integer> v = new Vector<Integer>(3, 2); 

System.out.println("Initial size: " + v.size()); 
System.out.println("Initial capacity: " + 
                   v.capacity()); 

v.addElement(1); 
v.addElement(2); 
v.addElement(3); 
v.addElement(4); 

System.out.println("Capacity after four additions: " + 
                   v.capacity()); 
v.addElement(5); 
System.out.println("Current capacity: " + 
                   v.capacity()); 
v.addElement(6); 
v.addElement(7); 

System.out.println("Current capacity: " + 
                   v.capacity()); 
v.addElement(9); 
v.addElement(10); 

System.out.println("Current capacity: " + 
                   v.capacity()); 
v.addElement(11); 
v.addElement(12); 


System.out.println("First element: " + v.firstElement()); 
System.out.println("Last element: " + v.lastElement()); 

if(v.contains(3)) 
  System.out.println("Collection contains 3."); 

// traverse through the elements in the collection. 
Enumeration vE = v.elements(); 

System.out.println("\nElements in collection:"); 
while(vE.hasMoreElements()) 
System.out.print(vE.nextElement() + " "); 
System.out.println();
//Create and initialize linked list. 
LinkedList<Integer> ll = new LinkedList<Integer>();  
ll.add(-8);  
ll.add(20);  
ll.add(-20);  
ll.add(8);  
  
// Create a reverse order comparator. 
Comparator<Integer> r = Collections.reverseOrder();  

// Sort list by using the comparator. 
Collections.sort(ll, r);  

System.out.print("List sorted in reverse: ");      
for(int i : ll) 
  System.out.print(i+ " ");  

System.out.println();  

// Shuffle list. 
Collections.shuffle(ll);  

// Display randomized list. 
System.out.print("List shuffled: ");      
for(int i : ll) 
  System.out.print(i + " ");  

System.out.println();  

System.out.println("Minimum: " + Collections.min(ll));      
System.out.println("Maximum: " + Collections.max(ll));

}
}
