package com.class21;

public class School {

	public static void main(String[] args) {
	Student.school="Morning School";
	
	Student student0=new Student();	
	Student student1=new Student();
	//assigning  instance variables
	student1.studentName="Eric";
	student1.GPA=3.95;
	student1.school="Syntax ";
	
	Student student2=new Student();
	student2.studentName="Jaime";
	student2.GPA=3.5;
	student2.school="Syntax tecnologies";
	
	student1.displayInfo();
	student2.displayInfo();
	System.out.println("");
	student2.study(3);
	
	//int hour1=3, hour2;
	//hour1=4;
	//student1.study(hour1);//son degisikligi alir
	
	}

}
