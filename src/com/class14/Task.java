package com.class14;

public class Task {

	public static void main(String[] args) {
	// 1)Create a String that will hold a sentence. Write a program to get a new String without any spaces.
	// 2)Create a String that should be combination of letters,
	//	numbers and special characters. Find out how many alpha characters are there in the String.
	// 3)You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
	//	How would you find out how many sentences are in that String?
   String a="I have a student";
   System.out.println(a.replaceAll(" ", ""));
   
   String b="12354%&*&*";
   System.out.println(b.replaceAll("[0-9]", ""));
   //for(int i=b.length()-1; i>=0; i--) {
	//	System.out.print(b.charAt(i));
   //}	   
	String c="Is it saturday? Is it raining? Do we have a Java Class today?";	   
	String[] array=c.split("\\?");
	for(int i=0; i<array.length; i++) {
		System.out.println(array[i]);	
		
	}

}}
