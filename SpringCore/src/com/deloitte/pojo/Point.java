/**
 * 
 */
package com.deloitte.pojo;

/**
 * @author mat004
 *
 */
public class Point {
	private int x;
	private int y;
	
	public Point() {
		System.out.println("Point instantiated");
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
		System.out.println("setX");
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
		System.out.println("setY");
	}
	
	@Override
	public String toString() {
		return x+","+y;
	}
}
