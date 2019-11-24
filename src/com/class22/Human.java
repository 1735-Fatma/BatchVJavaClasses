package com.class22;

public class Human {
	//instance variables
	String name;
	String lastName;
	//static variables
	static int eyes=2;
	static int nose=1;
	static boolean brain=true;
	
	public static void main(String[] args) {
		Human human1=new Human();
		human1.name="john";
		human1.lastName="Smith";
		System.out.println(Human.eyes);//class ile cagirdi
		System.out.println(human1.nose);//obje ile cagirdi
		System.out.println(human1.eyes);
		System.out.println(brain);//direk cagirdi
		
		System.out.println("------------");
		Human human2=new Human();
		human2.name="jimmy";
		human2.lastName="Miller";
		human2.lastName="doe";
		
		System.out.println(human2.lastName);
		System.out.println(human1.name);
	}

}
