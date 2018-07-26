package com.deloitte.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;


class DBAccess{
	public Collection<String> getResult() {
        HashSet<String> result = new HashSet<String>();
		
		result.add("B");
		result.add("E");
		result.add("A");
		result.add("D");
		result.add("A");
		result.add("Z");
		
		return result;
	}
}
	
	
public class MainClass {
	
	public static void main(String[] args) {
		
		DBAccess db = new DBAccess();
		//db.getResult();
		
		for(String elements: db.getResult()) {
			System.out.println(elements);
		}
	}
}

