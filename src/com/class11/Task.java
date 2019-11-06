package com.class11;

public class Task {
	public static void main(String[]args) {
	//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
	//Create an array on integers and calculate the sum of all elements in an array.
	//Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
	String[] cars= {"volvo","BMW","Toyota","Clio","mercedez","Honda"};
	  for(int i=0; i<cars.length; i++) {
		 System.out.println(cars[i]);  
	  }
	  for(String i:cars) {
		  System.out.println(i);
	  }
	  //2
	  int sum=0;
	  int[] a= {10,2,3,4};
	  for(int i=0; i<a.length; i++){
		  sum+=a[i];
}
	  System.out.println(sum);
	 //3
	  String[] country= {"Turkey","Fransa","USA"};
	  for(int i=0; i<country.length; i++) {
		  if(country[i].equals("Turkey")) {
			System.out.println("Ankara");  
		  }else if(country[i].equals("Fransa")){
			System.out.println("Paris");    
		  }else if(country[i].equals("USA")) {
			  System.out.println("Washington");
		  }
	     }
	  
}
}