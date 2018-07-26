package com.deloitte.cui;

class Base{
	public int x;
	public int y;
	
	public Base(int x, int y) {
		this.x =x;
		this.y=y;
	}
	public Base() {
	
	}
	@Override
	public String toString() {
		return x+","+y;
	}
	 
    @Override
    public boolean equals(Object target) {
    	if (target != null) {
    		if(target instanceof Base) {
    			Base b = (Base)target;
    			if(x==b.x&&y==b.y) {
    				return true;
    			}
    		}
    	}
    	
    	return false;
    	
    }
}

public class MainClass {

	public static void main(String[] args) {
		Base b1 = new Base(2,3);
		String str;
		str ="X &Y: "+b1;
		System.out.println(str);
		
		Base b2 = new Base();
		Base b3 = new Base();
		b2.x=10;
		b2.y=20;
		b3.x=10;
		b3.y=20;
		System.out.println(b2.equals(b3));
	}

}
