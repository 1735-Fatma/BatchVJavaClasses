package com.class04;

import java.util.Scanner;

public class task1 {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("what is the loan needed");
	int num1=scan.nextInt();
	if(num1<200000) {
		System.out.println("you would need money");
	}else {
		System.out.println("you would reject the client");
	}
	System.out.println("i need to your age" );
	int age=scan.nextInt();
	if(age>18) {
		System.out.println("you will issue a driver licence ");
		
	}else {
		System.out.println("you will offer them to get");
	}
}}
	/*You are a loan specialist and you need to ask user what is the amount of loan is needed.
	 * 1 If loan is less than 200,000 then you would lend the money 
	 *  otherwise you would reject the
	 *  client.
	 * 2 You are DMV representative and you need to ask customer their age.
	 *  If they are 18 and older you will issue a driver licence to them,
	 *  otherwise you will offer them to get a learners permit.
	 * 
	 */
	
	
	


