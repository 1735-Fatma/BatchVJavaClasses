package com.class23;

public class Test {

		//Write a program that will have a constructor: one with parameters and
		//second without any parameters. Create a separate Test class 
		//where you will execute both of the constructors.

	Test(){		
	}
	Test(String model){
	System.out.println(model);	
	}
		public static void main(String[] args) {
    Test obj1=new Test();
    Test obj2=new Test("Toyota");
	}

}
