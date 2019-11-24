package com.class23;

public class BetterCar {
	/*we want to build Toyota cars that will
	 *have different models and color
	 * 
	 */
		public static String make;
		public String model;
		public String color;
		public int speed;
		public int doors;
		
		BetterCar(String carModel,String carColor,int carSpeed,int carDoors){
			model=carModel;
			color=carColor;
			speed=carSpeed;
			doors=carDoors;
		}
public static void main(String[]args) {
		make="BMW";
		//compiler will give an error ,we have to pass values when we build a
		//those values will be passed  as arguman ts to the constr.
		//through constr. instance variables  will get initialized
		//BetterCar bcar1=new BetterCar();
		BetterCar bcar1=new BetterCar("X5","Blue", 400,2); 
		
		}
		public void getDetails() {
		System.out.println("i build "+color+" "+make+" "+model);
		System.out.println("my car has "+doors+" doors andcan have speed up to "+speed);
			
		}
		
		
	}


