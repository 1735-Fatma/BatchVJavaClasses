package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		String []animals= {"cat","cow","dog","snake","elephant"};
       // i want to print all values from an array
		// when value is dog---> i love dog
		for(int i=0; i<animals.length; i++) {
			if( animals[i].equals("dog")) {
				System.out.println("i love dogs");
			}else {
				System.out.println(animals[i]);
			}
		}
	}

}
