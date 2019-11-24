package com.class05;

public class LogicalNot {

	public static void main(String[] args) {
		//using ! we are reverting condition
		boolean b1=!true;
		boolean b2=!false;
		System.out.println(b1);
        System.out.println(b2);
        
        boolean traffic=true;
        // if traffic -->late,else-->on time
        if(!traffic) {
        	System.out.println("on time");
        }else {
        	System.out.println("late");
        }
        boolean isRain=false;
        if(!isRain) {
        	System.out.println("take an umbrella");
        }else {
             System.out.println("don't take an umbrella");
        }
        // let's compare 2 numbers using Not operator
        int num1=10;
        int num2=11;
        if(num1==num2) {
        System.out.println("numbers are equal");	
        	
        }else {
        	System.out.println("numbers are not equal");
        }
        if(!(num1==num2)) {
        	System.out.println("number are NOT equal");
        }else {
        	System.out.println("number are equal");
        }
        //if name is not Marry or Anna than you are not  my sister
        String name="Helen";
        String name2="July";
        //true Or false-->true add NOt-->False
        if(!(name.equals("Marry") || name2.equals("Anna"))){
        	System.out.println("you are not my sister");
        }else {
        	System.out.println("you are my sister");
        }
	}

}
