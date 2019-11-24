package com.class09;

public class ClassNotlari {

	public static void main(String[] args) {
		//For loop - best choice to use when # of repetition is known
		//while / do while - when we do not know how many times we want to repeat block of code
		//for loop syntax
		//for(initialization/start point; condition/end point;++/--){	
		//	code;
		// }

		for (int i=0; i<=4; i++){
			System.out.println("Good morning");//0, 1,2,3,4
		}

		//---------------------------------------------------
		//Nested loops
		for (int i=1; i<=3; i++){		
			System.out.println("I am outer loop");
			for (int j=1; j<=3; j++){
				System.out.println("I am inner loop");
			}
		}
		System.out.println("#######");
		//------------------------------
		//I am outer loop - 1 iteration of outer i loop
		//I am inner loop
		//I am inner loop
		//I am inner loop
		//I am outer loop - 2 iteration of outer i loop
		//I am inner loop
		//I am inner loop
		//I am inner loop
		//I am outer loop - 3 iteration of outer i loop
		//I am inner loop
		//I am inner loop
		//I am inner loop
		//--------------------------------------------
		//Nested loops
		for (int x=1; x>=3; x++){
			
			System.out.println("''I am outer loop");

			for (int y=1; y<=3; y++){

				System.out.println("''I am inner loop");
			}
		    }

	}

}
