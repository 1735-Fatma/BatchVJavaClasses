package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {
public static void main(String[]Args) {
	//built in
	String str="Hello";
	str.replace("Hello", "Hi");
	System.out.println(str);
	Scanner scan=new Scanner(System.in);
	String scannerString=scan.nextLine();
	System.out.println(scannerString);
	
	BuiltAndUserDefinedMethods obj=new BuiltAndUserDefinedMethods();
	obj.myMethod();
	
}
	void myMethod() //method header
	{ //method body
		System.out.println("This is user defined method that i created ");	
}
}