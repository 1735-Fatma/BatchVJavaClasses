package com.class4;

public class NestedIfMore {
public static void main(String[]args) {
	/*check age, if age is less then 16-->you are too young to drive
	 * otherwise-->you are eligible to drive& we will check 
	 * if you are older than 18-->
	 * you can get driver license and if not you can get learner permit 
	 */
	int age=55;
	if(age<16) {
		System.out.println("you are too young to drive");
	}else {
		System.out.println("you are eligible to drive");
		if(age>=18) {
			System.out.println("you can drive alone");
		}else {
			System.out.println("you need your parents to drive");
		}
	}
}
}
