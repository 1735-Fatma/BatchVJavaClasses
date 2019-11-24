package com.class23;

public class Car {
/*we want to build Toyota cars that will
 *have different models and color
 * 
 */
	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	
	
	public void getDetails() {
	System.out.println("i build "+color+" "+make+" "+model);
	System.out.println("my car has "+doors+" doors andcan have speed up to "+speed);
		
	}
}
