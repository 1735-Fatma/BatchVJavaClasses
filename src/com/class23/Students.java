package com.class23;

public class Students {
	//Write a java program of Class Students that takes students name
	//	and 3 subject grades. Inside your class also have a method
    //	to Calculate Average Grade. Test Student class for 5
	//	different students with different marks. Your program
	//	should print an average mark of each students name.
	//NOTE: please use different names for instance and local variables.
	String name1;
	int grade1;
	int grade2;
	int grade3;
	Students(String name1,int grade1,int grade2,int grade3 ) {
		System.out.println(name1+" "+(grade1+grade2+grade3)/3);
	}	
	public static void main(String[]args) {
		Students student1=new Students("inci",50,30,70);
		Students student2=new Students("zeynep",50,50,50);
		Students student3=new Students("ayse",40,80,50);
	}
}
