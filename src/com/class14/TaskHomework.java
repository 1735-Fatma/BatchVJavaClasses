package com.class14;

import java.util.Scanner;

public class TaskHomework {

	public static void main(String[] args) {
	// Write a program that reads two people's first names and if they expecting boy or girl?
	//Based on the input suggests a name for a baby:
	//Example Output:Mom’s first name? MaryDad’s first name?
	//DanielBoy or Girl? boySuggested baby name:
	//DANRYExample Output:Mom’s first name? MaryDad’s first name?
	//DanielBoy or Girl? girlSuggested baby name: MAIEL
		Scanner scan=new Scanner(System.in);
		String fatherName,momsName,gender;
		
	System.out.println("You write a moms name ");
	momsName=scan.nextLine();
	System.out.println("You write a dads name ");	
	fatherName=scan.nextLine();	
	System.out.println("You write a suggest gender");
	gender=scan.nextLine();
	
	if(gender.equals("girl")) {
		System.out.println(momsName.substring(0,momsName.length()/2)+fatherName.substring(fatherName.length()/2));
	}else if(gender.equals("boy")) {
	System.out.println(fatherName.substring(0,fatherName.length()/2)+momsName.substring(momsName.length()/2));
	}else {
		System.out.println("unknown");
	}
	
	}
}
