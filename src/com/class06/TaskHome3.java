package com.class06;

import java.util.Scanner;

public class TaskHome3 {
	public static void main(String[]args) {
	//HomeWork: Using scanner class create calculator. 
	//Allow user to enter 2 numbers and operator(+,-,*,/).
	//Based on operator provide the result to user.
	Scanner scan=new Scanner(System.in);
	System.out.println("enter first number");
	int num1=scan.nextInt();
	
	System.out.println("enter operator");
	String operator=scan.next();
	
	System.out.println("enter second number");
	int num2=scan.nextInt();
	
	if(operator.equals("+")) {
        System.out.println(num1+num2);
	}else if(operator.equals("-"))  {
		System.out.println(num1-num2);
	}else if(operator.equals("*")) {
		System.out.println(num1*num2);
	}else if(operator.equals("/")) {
		System.out.println(num1/num2);
	}else {
		System.out.println("invalid number and operator entered");
	}
	
	
}
}