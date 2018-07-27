package com.deloitte.maths.main;

import java.util.Scanner;

import com.deloitte.maths.Addition;
import com.deloitte.maths.Arithmetic;
import com.deloitte.maths.Division;
import com.deloitte.maths.Multiplication;
import com.deloitte.maths.Subtraction;

public class MainClass {
	public static void main(String[] args) {
		int num1 , num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		
		Arithmetic[] arr= new Arithmetic[5];
		arr[1] = new Addition(num1, num2);
		arr[2] = new Subtraction(num1, num2);
		arr[3] = new Multiplication(num1, num2);
		arr[4] = new Division(num1, num2);
		
		System.out.println("Enter 1 for additon , 2 for subtraction, 3 for multiplication, 4 for division");
		int choice  = sc.nextInt();
		
		int ans = arr[choice].calculate();
		System.out.println("Answer is "+ ans);
		sc.close();
		
	}

}