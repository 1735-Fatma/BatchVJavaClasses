package com.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
		
		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		int a=2;
		System.out.println(grades[4]);
		System.out.println(grades[a]);
		a+=2;
		//2+2System.out.println(grades[a]);
		a--;//3
		System.out.println(grades[a]);
		System.out.println("--------------------");
		//          System.out.println(grades[0]);
		//          System.out.println(grades[1]);
		//          System.out.println(grades[2]);
		//          System.out.println(grades[3]);
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);}
		System.out.println("--------------------");
		String[] animals= {"Cat", "Dog", "Cow", "Snake", "Elephant"};
		int size=animals.length;
		for(int i=0; i<size; i++) {
			System.out.print(animals[i]+" ");
			}
		
	}

}
