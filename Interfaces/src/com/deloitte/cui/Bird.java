package com.deloitte.cui;

public class Bird extends Animal implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Bird taking off.");

	}

	@Override
	public void land() {
		System.out.println("Bird landing.");

	}

	@Override
	public void fly() {
		System.out.println("Bird flying.");

	}
	
	public void buildNest() {
		System.out.println("Bird building nest.");
	}
	
	public void layEggs() {
		System.out.println("Bird laying eggs.");
	}
	
	public void eat() {
		System.out.println("Bird eating.");
	}

}
