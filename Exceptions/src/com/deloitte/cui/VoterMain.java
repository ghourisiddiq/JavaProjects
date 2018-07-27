package com.deloitte.cui;

class IllegalAgeException extends Exception {
@Override
public String getMessage() {
	return "Grow up, kid.";
}
}

class Voter{
	public void register(int age) throws IllegalAgeException {
		if(age<18) {
			throw new IllegalAgeException();
		}
	}
}

public class VoterMain {

	public static void main(String[] args) {
		Voter v1 = new Voter();
	
			try {
				v1.register(16);
			} catch (IllegalAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
