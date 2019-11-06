package com.class11;
import java.util.Arrays;
public class ArrayManipulationSort {
public static void main(String[]args) {
	String[] actualNames= {"John","Smith","Alex","Tanaz"};
	String[] expectedNames= {"Smith","John","Alex","Tanaz"};
	
	//to short the element of an array
	Arrays.sort(expectedNames);
	String expected=Arrays.toString(expectedNames);
	System.out.println(expected);
	
	//String actual=Arrays.toString(actualNames);
	
	

	    String firstname="zom";
	    String firstname2="ali";
	    
	    String firstname3="ali";
	    String firstname4="zom";
	String actl=firstname+firstname2;
	String expt=firstname3+firstname4;
	System.out.println(actl);
	System.out.println(expt);
	
	
	
	int[] numbers= {123,34,55,66,99};
	for(int i:numbers) {
		System.out.println(i+" ");
	}
	System.out.println();
	System.out.println("*******");
	
	
}
}
