package com.class4;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("do you have credit card?true or false");
		boolean card = scan.nextBoolean();
		/*Create a Java program that will ask if user has a credit card or not.
		 * if you user does not have a credit card then offer them. 
		 * If they do have one  ask what is balance on the card? 
		 * If balance of the card is larger than 1000, 
		 * tell them to pay off immediately,
		 *  otherwise you can tell them that they can spend more
		 */
		if (card) {

			System.out.println("what is the balance your card");
			int balance = scan.nextInt();

			if (balance > 1000) {
				System.out.println("please pay off your balance");
			} else {
				System.out.println("you can spend more money");

			}
		} else {
			System.out.println("would you like to apply for credit card");
		}
	}
}
