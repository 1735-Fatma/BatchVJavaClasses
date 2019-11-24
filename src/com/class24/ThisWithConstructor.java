package com.class24;

public class ThisWithConstructor {
	ThisWithConstructor(){
		System.out.println("i am non argument constructor");
	}
	ThisWithConstructor(String str){//once icine bakip sonra devam ediyor
		this();//used to call current class constructor//mutlaka ilk satira 
		//yazilmali ve sadece 1 tane yazilabilir
		System.out.println("i am constructor with 1 string parameter");
	}
	ThisWithConstructor(String str,String str1){
		this("hello");//always Must be a first Statement
		//this();in this case compiler error
		
		System.out.println("i am constructor with 2 parameter");
	}
	public static void main(String[] args) {
		ThisWithConstructor obj=new ThisWithConstructor("hello");
		System.out.println("----------------");
		//can we execute 2 const. when creating an obj.
		//yes -it can be  achieved using this(
		//this type of constructor calls is known as CONSTRUCTOR CHAINING
		ThisWithConstructor obj1=new ThisWithConstructor("hello","Bye");
	}
}
