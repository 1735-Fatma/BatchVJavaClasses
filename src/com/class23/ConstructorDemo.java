package com.class23;

public class ConstructorDemo {
	//ConstructorDemo(){  default
	//	}
	ConstructorDemo(){
	System.out.println("i am your constructor");//ilk bu yazilir	
	}
	ConstructorDemo(String str){
		System.out.println("i am  constructor with 1 parameter "+str);	
		}
	ConstructorDemo(int num,int num1){
		System.out.println("i am  constructor with 1 parameter "+num+" "+num1);	
		}
	public static void main(String[] args) {
		ConstructorDemo obj=new ConstructorDemo();//1bundan baslar
		System.out.println("code after creating an object");//2..sonra bu
		obj.hello("hello");
		ConstructorDemo obj2=new ConstructorDemo(123,345);
		
	}
    public void hello(String str) {
	System.out.println("hello class1");//3.
	System.out.println("hello instructors1");//4.bu
}
}
