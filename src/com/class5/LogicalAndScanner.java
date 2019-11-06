package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		/* ask user to enter age
		 * if age is from 1 to 3-->you are a baby
		 * if age from3-5-->you are a toddler 
		 * if age from 5-12--> you are a kid
		 * if age from 12-19-->teenegar
		 * if age>20-->you are an adult
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("you enter your age");
		int age=scan.nextInt();
		String human;
		if(age>=1 && age<=3) {
			//System.out.println("you are a baby");
			human="baby";
		}else if(age>3 && age<=5) {
			//System.out.println("you are a toddler");
			human="toddler";
		}else if(age>5 && age<=12) {
			//System.out.println("you are a kid");
			human="kid";
		}else if(age>12 && age<=19){
			//System.out.println("teenegar");
			human="teenager";
		}else if (age>=19) {
			//System.out.println("you are an adult");
			human="adul";
		}else {
			//System.out.println("Invalid age entered");
			human="unknown";
		}
		System.out.println("you are "+human);
	}

}
