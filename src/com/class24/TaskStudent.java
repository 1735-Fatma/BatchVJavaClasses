package com.class24;

public class TaskStudent {
/* 1.Write program as a Student class   that has instance variables name and address.
 * Create a constructor that will initialize those variables.
 * Print name & address of given  student by the displayInfo method.
 * 
 * 2.Write program as a Book class   that will have 2 Constructors.
 * While creating an object make sure:
 * Instance variables are being initializedBoth Constructors are being executed
 */
	String name;
	String adress;
	TaskStudent(String name, String adress ){
		this.name=name;
		this.adress=adress;
	}		
	public void displayInfo() {
		System.out.println(name+"'s adress is: "+ adress);	
		}
	public static void main(String[] args) {
		TaskStudent obj=new TaskStudent("Ahmet","Street:2 no/5 Texas ");
		obj.displayInfo();
	}
	}

