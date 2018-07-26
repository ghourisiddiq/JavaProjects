package com.deloitte.cui;


public class MainClass {

	public static void main(String[] args) {
		
		try{
			
			System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
		} 
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Enter 2 valid numbers");
		}
		catch(NumberFormatException ne) {
			System.out.println("Enter an integer value");
		}
		catch(ArithmeticException are) {
			System.out.println("Cannot divide by 0");
		}
        finally {
        	System.out.println("NI");
        }
	}

}

