package com.deloitte.maths;

public class Multiplication extends Arithmetic {

	public Multiplication(int num1, int num2) {
		super(num1, num2);
		
	}

	@Override
	public int calculate() {
		int mul = num1*num2;
		return mul; 

	}
}
