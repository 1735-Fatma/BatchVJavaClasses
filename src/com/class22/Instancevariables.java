package com.class22;

public class Instancevariables {
String name="Samir";
	
	
	public static void main(String[] args) {
		String name="Burcu";
		System.out.println(name);
		
		Instancevariables obj=new Instancevariables();
		System.out.println(obj.name);
		//changing value of the instance variable
		obj.name="John";
		System.out.println(obj.name);
		//creating a new instance of Class instanceVariables
		Instancevariables obj1=new Instancevariables();
		//value will be Samir
		System.out.println(obj1.name);//////cok onemli direk instanstakini copy yapip samir geldiii bunu
		//yaz eger 
		
	}

}
