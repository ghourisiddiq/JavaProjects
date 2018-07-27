package com.deloitte.array.main;

import java.util.Scanner;
import com.deloitte.array.Array;

public class MainClass{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.print("Enter all the numbers");
		for(int j=0;j<n;j++) {
			array[j]=sc.nextInt();
		}
		boolean x= Array.checkTripplets(array);		
			if(x)
			System.out.println("TRUE");
			else
			System.out.println("FALSE");
	
	}
	
	
}







	
