package com.class5;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		//Prompt the user to enter person heights in feet. 
		//Person should be classified as one of the following:
		//short (under 5 feet)
		//medium(5 to 6 feet)
		//tall (6 feet and over)
		Scanner scan=new Scanner(System.in);
		System.out.println("you enter a feet");
		int feet=scan.nextInt();
		
		if(feet<5) {
			System.out.println("short");
		}else if(feet>=5 && feet<6) {
			System.out.println("medium");
		}else if(feet>6) {
			System.out.println("tall");
			
		}else {
			System.out.println("no");
		}
			
	}

}
