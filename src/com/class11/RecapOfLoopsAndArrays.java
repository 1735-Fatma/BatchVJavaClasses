package com.class11;

public class RecapOfLoopsAndArrays {

	public static void main(String[] args) {
		//     1      2,5     4,7
		for(int i=0; i<=5; i++) {
			  //3,6
			System.out.println("Bye");
		}
		
		System.out.println("#############33");
		int i = 0;
		// 1             2,5     4,7
		for ( System.out.println("Hello");i <= 5;System.out.println("Bye") ) {
			i++;
			//3,6
			System.out.println(i);
			}
		
		
		//for(;;) {
		//	System.out.println("Hello");//infinity  sonsuz oldu
		//}
		int[] arr= {2,3,5,7};
		
		for(int a:arr) {
			System.out.println(a);
		}
		int[] numbersList= {2,3,5,7};
		for(int eleman:numbersList) {
			System.out.println(eleman);
		}

	}

}
