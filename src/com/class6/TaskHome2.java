package com.class6;

import java.util.Scanner;

public class TaskHome2 {
	public static void main(String[]args) {
	//Allow user to enter grade and then provide explanation:
	//A-Excellent, B-Good, C-Average,D-Bad,
	//any other grade --> Not Acceptable. 
	//At the end your program should print 
	//which grade was entered by a user with explanation.
	char grade;
	
    Scanner scan=new Scanner(System.in);
    System.out.println("enter your grade");
	grade=scan.next().charAt(0);
	
	String explanation;
	switch (grade){
	case 'A':	
		explanation = "Excellent";
	break;
	case'B':
		explanation ="Good";
	break;
	case 'C':
		explanation ="Average";
	break;
	case 'D':
		explanation ="Bad";
	break;
	default:
		explanation ="invalid";
	break;	
	}
	System.out.println(explanation);
}
}
