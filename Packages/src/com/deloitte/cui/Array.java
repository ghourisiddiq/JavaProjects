package com.deloitte.cui;

public class Array {

	public static void main(String[] args) {
		int arr2[] = new int[10];
		int arr1[] = {1,3,5,7,9};
		
		System.arraycopy(arr1,0,arr2,3,5);
		
		
		System.out.print("Arr1 = ");
		for(int i: arr1) {
			System.out.print(+i);
		}
		
		System.out.println("");
		
		System.out.print("Arr2 = ");
		for(int i: arr2) {
			System.out.print(+i);
		}

	}

}
