package com.class9;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		        //Write a guessing game where the user has
				//to guess a secret number between 1 and 20.
				//After every guess input, the program tells the user whether 
				//their number was too large or too small.
				//The program will keep asking the user to enter the number
				//until he finds the correct number. When the correct answer is
				//found the system should display “Congratulations!!. You got it!”
		Scanner scan=new Scanner (System.in);
		int num=12;	
		int g;
		   
		do {
				System.out.println("please guess my number 1 to 20");
				g =scan.nextInt();	
			    if(g>num) {
	    		  System.out.println("too large");
	    	     }
			     else { 		
	    		 System.out.println(" too small");
			     }
		}
		while(g!=num); 
		System.out.println("congratulations");		
		//for(i=1 ; i<=20 ; i++) {
        //    System.out.println("Please,guess a number between 1and 20!");
         //    i=s.nextInt();
         //if(a>i) {
        //System.out.println("This number was too small!!");
        //}else if(a<i) {
        //System.out.println("This number was too large!!");
        //}else  {
        //System.out.println("Congratulations!!. You got it" );
         //  break;
       }   		     
		}

		     
		