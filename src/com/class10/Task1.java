package com.class10;

public class Task1 {

	public static void main(String[] args) {
		// Create an array of countries.
		//While retrieving all values from an array print capital for each country.
		String[]countries= { "Turkey","France","Egypt"};
		for( int i=0; i<countries.length; i++) {
			if( countries[i].equals("Turkey")) {
				System.out.println("Ankara");
			}else if(countries[i].equals("France")) {
				System.out.println("Paris");
			}else if(countries[i].equals("Egypt")) {
				System.out.println("Cairo");
			}
		}
		//second way
		
		//String[] countries = { "Afghanistan", "Colombia", "USA", "Russia", "Turkey" };
		//for (int i = 0; i < countries.length; i++) {
		//	switch (countries[i]) {
		//	case "Afghanistan":System.out.println("Kabul");
		//	break;
		//	case "Colombia":System.out.println("Bogota");
		//	break;
		//	case "USA":
		//	System.out.println("Washington DC");
		//		break;
		//case "Turkey":
		//	System.out.println("Ankara");
		//break;
		//case "Russia":
		//	System.out.println("Moscow");
		//	break;}}
	}

}
