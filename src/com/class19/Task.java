package com.class19;

public class Task {
	//Create a method createEmail(). Based on provided users name, lastName and email type,
	//your method should return complete email Address. Example: johnsnow@gmail.com or johnsnow@yahoo.com*
	//2..Write a method to return whether given number is prime or not?
	//3..Create  class Student that will have a method getGrade.
	//Your method should accept the score of a student and return a grade:
	
	//score > 90 - A
	//score >80 - B
	//score >70 - C
    //score > 50 - D
	//anything else - F

String  createEmail(String name,String name1,String type) {
	String sub=name+name1+type;
    return sub;	
}
char grade(int number) {
	char score;
	if(number>=90) {
		score= 'A';
	}else if(number>=80) {
		score='B';
	}else if(number>=70) {
		score='C';
	}else if(number>=50) {
		score='D';
	}else {
		score= 'F';
	}
	return score;
}
boolean isPrime(int number) {
	boolean isPrime = true;
	if(number<=1) {
	isPrime=false;	
	}else {
		for (int i = 2; i <=number/2; i++) {

			if (number % i == 0) {
				isPrime = false;
				break;
	            }
              }	  
		}
	return isPrime ;		
}
  	
public static void main(String[]args) {
	Task a=new Task();
String ab=a.createEmail("John", "snow", "@gmail.com");
	System.out.println(ab);

  char score  =a.grade(40);
  System.out.println(score);
  
  boolean prime =a.isPrime(10);
  System.out.println(prime);
}
}