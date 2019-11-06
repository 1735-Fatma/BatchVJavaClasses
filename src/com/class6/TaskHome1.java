package com.class6;

import java.util.Scanner;

public class TaskHome1 {
public static void main(String[]args) {
	//Ask user to enter their country and capture it.
	//Once values are captured print which language user speaks.
	String country,language;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your Country");
	 country=scan.nextLine();
	
	switch(country) {
	case "Turkey":
	language="Turkish";	
	break;
	case  "Canada":
	language="English";
	break;
	case "Germany":
	language="German";
	break;
	case "Egypt":
	language="Arabic";
	break;
	default:	
	language="Invalid";
	break;
	}
	System.out.println("Your  Country is a "+country+" and your Language is "+language);
}
}