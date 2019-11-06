package com.class9;

public class Example3 {

	public static void main(String[] args) {
		//123456789
		//123456789
		//123456789
		//123456789
		//123456789
		for(int a=1; a<=5; a++) {//satir  line 5
			for(int b=1; b<=9; b++ ) {  //burada 9
				System.out.print(b);//123456789
			}
			System.out.println();
		   }
		System.out.println("******");
		//54321
		//54321
		//54321
		//54321
		//54321
		for(int i=5; i>=1; i--) {
			for(int a=5; a>=1; a-- ) {
				System.out.print(a);//54321
			}
			System.out.println();
		}
		System.out.println("######");
		//55555
		//44444
		//33333
		//22222
		//11111
		for(int i=5; i>0; i--) {//rows
			for(int j=1; j<5; j++) {// cows
				System.out.print(i);//1111	
			}
			System.out.println();
		}
	}

}
