package com.class9;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		//Write a program that reads a range of integers (start and end point),
		//provided by a user and then from that
		//range prints the sum of the even and odd integers.
  Scanner scan=new Scanner(System.in);
  System.out.println("you enter start number");
  int firstNumber=scan.nextInt();
  System.out.println("you enter end number");
	int secondNumber=scan.nextInt();
	
	int start=0;
	int end=0;
	if(firstNumber<secondNumber) {
		start=firstNumber;
		end=secondNumber;
	}else {// assuming firstNumber is-->secondNumber
		start=secondNumber;
		end=firstNumber;
	}
	int sumEven=0;
	int sumOdd=0;
	
for(int i=start; i<=end; i++) {
	if(i%2==0) {
	sumEven=sumEven+i;	
	}else {
	sumOdd=sumOdd+i;	
	}
    }
    System.out.println("even number "+sumEven);
    System.out.println("odd number"+sumOdd);
    /// eger bu ustteki islemi yapmak istemazsen sadece alt kisama 
    //System.out.println("please enter start # less then
    //end number") yazabilirsin.ustteki if ve else li kisimi//if
}
	}


