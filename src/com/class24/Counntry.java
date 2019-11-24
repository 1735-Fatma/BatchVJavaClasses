package com.class24;

public class Counntry {
public String capital,name;
public int population;
Counntry(){
	System.out.println("i AM non argument CONSTRUCTOR ");
}
Counntry(String name,String capital, int population){
	this.capital=capital;//koyu mavi renk local veriable
	this.name=name;//turkuaz instance variable
	this.population=population;
}
public void displayInfo() {
	System.out.println(name+" "+capital+" "+population);	
}
public static void main(String[]args) {
//	Counntry country1=new Counntry();
//	country1.name="usa";
//	country1.capital="Washington Dc";
//	
//	Counntry country2=new Counntry();
//	country2.name="kazakistan";
//	country2.capital="Astana";
//	System.out.println(country1.name);
//	System.out.println(country1.capital);	
//	
//	System.out.println(country2.name);
//	System.out.println(country2.capital);
//	
//	System.out.println(country3.name);
//	System.out.println(country3.capital);
	
	Counntry country1=new Counntry("Usa","Washington DC",350);
	Counntry country2=new Counntry("Kazakhistan","Astana",18);
	Counntry country3=new Counntry();
	country1.displayInfo();
	country2.displayInfo();
	country3.displayInfo();
	
}
}
