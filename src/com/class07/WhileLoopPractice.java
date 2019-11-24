package com.class07;

public class WhileLoopPractice {

	public static void main(String[] args) {
		//how to print  numbers from 1to20
		int i=0;
		while(i<=20) {
		System.out.println(i);
		i++;
		}
        // i want to print numbers from 10  to 30 all in 1 line
		int y=10;
		while(y<=30) {
		System.out.print(y+" ");
		y++;
		}
		//how to print values 10 to 1;
		int a=10;
		while(a>=1) {
		System.out.println(a);
		a--;
		}
		// print values from 50 to 20
		int c=50;
		while(c>=20) {
		System.out.println(c+"-----");
		c--;
		}
		// I want to print all even numbers from 1 to 20
		int z=1;
		while(z<=20) {
		System.out.println(z);	
		z+=2;	
		}
		// 2 way using modulus
		int q=2;
		while (q<=20) {
			
		if(q%2==0) {	
		System.out.println(q+ "------");
		           }
		q++;
		}
		System.out.println("****");
// print  only  odd number from 50 to 100
// print  only even numbers from 100 to 1
	int f=50;
	while(f<100) {
	System.out.println(f);
	f+=2;
	}
	int t=99;
	while(t<=1) {
	System.out.println(t+"tt");	
	t-=2;	
	}
		
}}
