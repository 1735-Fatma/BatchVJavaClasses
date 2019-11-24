package com.class04;

public class IfElseRecap {
public static void main(String[]args) {
	/*
	 * class schedule
	 * if tuesday-->sdlc
	 * if wednesday-->java rewiev
	 * if thursday-->sdls
	 * if saturday-->java coding
	 * if sunday-->my favorite java coding
	 * burasi cok onemli diger butun programlarda ayni
	 */
	
	int day=4;
	if(day==2) {
	System.out.println("sdls class");	
	}else if(day==3) {
		System.out.println("review class");
	}else if(day==4) {
		System.out.println("sdls class");
		
	}else if(day==6) {
		System.out.println("java class");
	}else if(day==7) {
		System.out.println("favorite java class");
	}else {
		System.out.println("there is no class at school");
	}
}
}
