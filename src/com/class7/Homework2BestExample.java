package com.class7;

import java.util.Scanner;

public class Homework2BestExample {

	public static void main(String[] args) {
		/*you need to ask user to pay for coffee
		 *you need to keep asking user to pay for it until 
		 *entered price is equal=5;
		 *after user paid then say "enjoy your coffee!" 
		 */
		Scanner scan=new Scanner(System.in);
		int price;
		do {
		System.out.println("Please pay for your coffee");
		price=scan.nextInt();
		}while(price!=5);
		System.out.println("enjoy your coffee!" );
		//2.yol
		// scan=new Scanner(System.in);
		// int price=1;
		// while(price!=5){
		// System.out.println("Please pay for your coffee");
		// price=scan.nextInt();
		// }
	    // System.out.println("enjoy your coffee!" ); 
		
		
	}}
	
