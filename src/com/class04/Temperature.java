package com.class04;

import java.util.Scanner;

	public class Temperature {
		public static void main(String[]args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("please enter you city");
			String cityName=scan.nextLine();
			System.out.println("Please enter temperature");
			int temp=scan.nextInt();
			int convertedTemp=(temp-32)*5/9;
			System.out.println("The temperature in city "+cityName +" is "+convertedTemp);
		    //Create a Java program that will ask user to input city and temperature.
			//Your program  should convert Fahrenhe it into celsius and print 
			//�The temperature is the city __ is __�
	}
}

