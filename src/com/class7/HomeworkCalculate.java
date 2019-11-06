package com.class7;

import java.util.Scanner;

public class HomeworkCalculate {
	public static void main(String[]args) {
	int num1,num2,total=0;	
	char op;
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter first number");
	num1 = scan.nextInt();
	System.out.println("Please enter operator");
	op = scan.next().charAt(0);
	System.out.println("Please enter the second number");
	num2 = scan.nextInt();
	switch(op) {
	case'*':
		total=num1 * num2;
	break;
	case'-':
		total=num1 - num2;
	break;
	case'+':
		total=num1 + num2;
	break;
	case'/':
		total=num1 / num2;
	break;
	default:
		System.out.println("wrong number");
	}
	System.out.println(total);
	}
}

  