package com.class6;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[]args) {
	//Program to find largest number among three numbers using nested 
	//if provided by a user (numbers must be distinct
     Scanner scan=new Scanner(System.in);
     System.out.println("enter first double number");
     double num1=scan.nextDouble();
     System.out.println("enter second double number");
     double num2=scan.nextDouble();
     System.out.println("enter third double number");
     double num3=scan.nextDouble();
     
     if(num1>num2) { 
    	 if(num1>=num3) {
   	      System.out.println(num1);
    	}
        }else if (num2>num3) { 
    	if(num2>=num1) {
   	      System.out.println(num2);  
    	} 
        }else if (num3>num1) { 
    	if(num3>=num2){
   	      System.out.println(num3);
    	}
     }else {
        System.out.println("All numbers are equal to each other."); 
     }   
    	     
  
  }
}
       
     






