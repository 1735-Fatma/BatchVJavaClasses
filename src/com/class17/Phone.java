package com.class17;

public class Phone {
 String brand,model;
void watchMovie() {
    System.out.println("I can watch movie on my "+brand);
}
 void call() {
	System.out.println("I can call my"+model+" model Phone "); 
 }
public static void main(String[]args) {
	Phone phone1=new Phone();
	phone1.brand="IPhone";
	phone1.model="S7";
	
	phone1.watchMovie();
	phone1.call();
	
	Phone phone2=new Phone();
	phone2.brand="Android";
	phone2.model="A3";
	
	phone2.watchMovie();
	phone2.call();
	
	Phone phone3=new Phone();
	phone3.brand="Nokia";
	phone3.model="i5";
	
	phone3.watchMovie();
	phone3.call();
	
	
	
}
}