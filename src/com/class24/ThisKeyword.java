package com.class24;

public class ThisKeyword {
int a,b;
	
public ThisKeyword (int a,int b) {
	this.a=a;
	this.b=b;
}
public ThisKeyword() {
	System.out.println("i am non argument constructor");
}
public void sum(int a,int b) {
	System.out.println("the sum of local parameters is "+(a+b));//10,20
	System.out.println("the sum of instance variables is "+(this.a+this.b));//5,10//instance variable
}
public void sayA() {
	System.out.println(a);
}
public void sayB() {
	System.out.println(b);
}
public void sayAandB() {
	this.sayA();
	sayB();//compiler adds this automatically-->this.sayB();
}
public static void main(String[] args) {
	ThisKeyword obj=new ThisKeyword(5,10);
	obj.sum(10, 20);
	obj.sayAandB();
	obj.sayA();
	obj.sayB();
	System.out.println("----------------");
	ThisKeyword obj1=new ThisKeyword(20,20);
	obj1.sum(100,200);//bunlar local variable (a+b) islemi yapiyor
	obj.sayA();
	obj.sayB();
}


}
