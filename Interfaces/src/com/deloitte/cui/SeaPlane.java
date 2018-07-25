package com.deloitte.cui;

public class SeaPlane extends Airplane implements Sailer {
	
	public void takeOff() {
		System.out.println("Seaplane taking off.");
	}
	
	public void land() {
		System.out.println("Seaplane landing.");
	}
	
	public void fly() {
		System.out.println("Seaplane flying.");
	}
	
	public void dock() {
		System.out.println("Seaplane docking.");
	}
	
	public void cruise() {
		System.out.println("Seaplane cruising.");
	}

}
