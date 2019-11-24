package com.class04;

import java.util.Scanner;

public class TaskSalary {
	public static void main (String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("how many years did you work");
	int year=scan.nextInt();
	System.out.println("how many your salary");
	int salary=scan.nextInt();
	if(year>=5) {
	System.out.println("eligible bonus");
	
		if(salary>=50000) {
		System.out.println("bonus 5000");	
		}else {
		System.out.println("bonus 3000");	
		
		}
	}else {
	System.out.println("he is not bonus");
	
	}	}}

  //Write a program to ask user to enter numbers of worked years and annual salary.
  // If user worked for more or equals to 5 years than user is eligible for the bonus,
  // otherwise he is not.Once user is eligible and
  //   salary is larger than50000 than bonus = 5000, other wise bonus=3000.
 
