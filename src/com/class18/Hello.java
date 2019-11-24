package com.class18;

public class Hello {
	void sayHello(String name) {
		System.out.println("Hello "+name);
	}
public static void main(String[]args) {
	Hello obj=new Hello();
	obj.sayHello("Asel");
	obj.sayHello("Wegas");
	obj.sayHello("Diego");
	obj.sayHelloDifferentLanguage("USA");
	obj.sayHelloDifferentLanguage("Russia");
	obj.sayHelloDifferentLanguage("Turkey");
	obj.sayHelloDifferentLanguage("spain");
	//obj.sayHelloDifferentLanguage(123);//you will get compiler error
	obj.saynameAndAge("Jack", 45);
	obj.saynameAndAge("Olga", 50);
	obj.isSnowing(false);
}
/*create a method that will say hello in different language based
 * on the value that will be passed when user calls a method 
 */
void sayHelloDifferentLanguage(String country) {//USA,Russia,Turkey e tek tek bakiyor
	
   
    switch(country.toLowerCase()) {//buraya yukaridaki ulke isimleri gelip switc icinde varsa cikiyor
    case "USA":
    	System.out.println("Hello");
    	break;
    case"Russia":
    	System.out.println("Privet");
    	break;
    case "Paraguay":
    	System.out.println("Hola");
    break;
    case "Albania":
    	System.out.println("Pershendetje");
    	break;
    	default:
    	System.out.println("I dont know your how to say hello your language");	
    }
}
//method to say name and age
 void saynameAndAge(String name, int age) {
 System.out.println("my name is"+name+" and I am" +age+" years old");
}
 //create a method that will check if it snowing
 //if snow --->stay at home,otherwise go for a walk
 void isSnowing(boolean isSnowing) {//method header
	//method body
	if(isSnowing) {
		System.out.println("Stay home");
	}else {
		System.out.println("Go for a walk");
	}
 }
}
