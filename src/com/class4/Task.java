package com.class4;

public class Task {
public static void main(String[]args) {

	boolean diploma=true;
	double gpa=3.5;
	if(diploma) {
	System.out.println("congratulations");
	 if(gpa>3.5) {
		System.out.println("you are eligible for scholarship");
	 }else if(gpa==3.5) {
		 System.out.println("you should have studied harder");
	}
	}
}	
}
/*Write a program to store a boolean value of whether user has diploma or not.
 *  If user has a diploma, you should say congratulations,
 *  otherwise program should suggest to get a degree.
 *   Then if user has a degree program should check a gpa score.
 *    If gpa score is higher or equals to 3.5 → output should say 
 * “You are eligible for scholarship”, 
 * otherwise → “You should have studied harder” .
 * 
 * boolean diploma=true;
	boolean degree=true;
	double gpa=2.5;
	if (diploma ) {
		System.out.println("congrations");
		    if(degree) {
			if(gpa>=3.5) {
				System.out.println("you are eligible scholarship");
			}else {
				System.out.println("you have studied harder");	
			}
			}	
	}else {
	System.out.println("diploma has not");	
	}
 * 
 */

