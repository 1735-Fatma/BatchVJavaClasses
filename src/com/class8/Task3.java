package com.class8;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		//1)print numbers from 1 to 50 except those that are divisible by 3
		
		//2)Create a program that will be   asking user to apply for a credit card 10 times.
	    //as soon as you get an "yes" from a user program should stop asking.
        for(int i=1; i<=50; i++) {
                 if(i%3==0  ) {  	 
                 continue;
                 }
                 System.out.println(i);        
        }
        //2
        String card;
        Scanner scan=new Scanner(System.in);
        for(int q=0; q<=10; q++) {
          System.out.println("Are you apply for credit card");
          card=scan.nextLine();
          if(card.equalsIgnoreCase("Yes")){
          break;	
        }
       }
}}
