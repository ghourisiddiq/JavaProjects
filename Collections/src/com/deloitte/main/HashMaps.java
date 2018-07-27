package com.deloitte.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMaps {

	public static void main(String[] args) {
		HashMap<Integer, String> result = new HashMap<Integer,String>();
		
		result.put(123, "ABC");
		result.put(345, "EFG");
		result.put(678, "ABC");
		result.put(345, "HHH");
		
		System.out.println(result.size());
		System.out.println(result.get(345));
		
		System.out.println(" ");
		Set<Integer> keys = result.keySet();
		
		for(Integer key:keys) {
			System.out.println(key+"-"+result.get(key));
		}
		
		System.out.println(" ");
		
		Iterator<Integer> itr = keys.iterator();
		Integer key;
		while(itr.hasNext()) {
			key = itr.next();
			System.out.println(key+"-"+result.get(key));
		}
	}

}
