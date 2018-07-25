package com.deloitte.cui;

public class Superman extends Kryptonian implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Superman Taking off.");

	}

	@Override
	public void land() {
		System.out.println("Superman landing.");

	}

	@Override
	public void fly() {
		System.out.println("Superman flying.");

	}
	
	public void leapBuilding() {
		System.out.println("Superman leaping over buildings.");
	}
	
	public void stopBullet() {
		System.out.println("Superman stopping bullets.");
	}
	
	public void eat() {
		System.out.println("Superman eating.");
	}

}
