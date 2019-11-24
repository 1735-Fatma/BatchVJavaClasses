package com.class24;

public class Task {

public Task() {
	System.out.println("i am p constroctor");
}
 Task(String str) {
	System.out.println("i am default constroctor");
}
protected Task(int num) {
System.out.println("i am protected constroctor");
}	
 private Task(int num,int num2) {
		System.out.println("i am private constroctor");
	}
public static void main(String[] args) {
		Task obj=new Task();
		Task obj1=new Task(4);
		Task obj2=new Task(4,5);
		Task obj3=new Task("some string");
}
}