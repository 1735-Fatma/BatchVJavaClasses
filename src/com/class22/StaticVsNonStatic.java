package com.class22;

public class StaticVsNonStatic {
//template  for a students(school, name,grade)	
static String school="syntax";
String name;
char grade;

//instance method
void getInfo() {
	System.out.println(" my name is "+name+" and i am going to"+school+" and my grade is "+grade);
}

//static method
static void getInfo1() {
	System.out.println("i am attending classes at"+school);
	/*system.out.println("my name is"+name);
	 *compiler will give an error 
	 * you CANNOT access NON Static members within STATIC methods
	 */
}
	public static void main(String[]args) {
		/*Accessing static members within same class
		 * -->just use name for a variable
		 * or call method by its name only
		 */
		System.out.println(school);
		getInfo1();
	}

}
