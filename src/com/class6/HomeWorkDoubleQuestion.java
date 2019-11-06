package com.class6;

import java.util.Scanner;

public class HomeWorkDoubleQuestion {
	public static void main(String[]args) {
		
	//1.Write a program to find largest of three double values using if-else..
	//if and logical operators provided by a user (numbers must be distinct)
      Scanner scan=new Scanner(System.in);
      System.out.println("enter first double number");
      double num1=scan.nextDouble();
      
      System.out.println("enter second double number");
      double num2=scan.nextDouble();
      
      System.out.println("enter third double number");
      double num3=scan.nextDouble();
      
      if(num1>num2 && num1>=num3) {
    	  System.out.println(num1);
      }
      else if (num2>num3 && num2>=num1) {
    	  System.out.println(num2);
      }
      else if (num3>num1 && num3>=num2){
    	  System.out.println(num3);
      }else {
    	  System.out.println("All numbers are equal to each other.3");
      }
    	  
      


}
	}	
	
	



