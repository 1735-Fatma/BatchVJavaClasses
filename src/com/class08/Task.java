package com.class08;

public class Task {

	public static void main(String[] args) {
		//1) print numbers from 1 to 100 in 1 line with space
        //2)Print numbers from 100-1
		//3)print even numbers from 20 to 1(2 ways)
		//4)print odd numbers between 20 and 50(2 ways)	
		for(int i=100; i>=1;  i--) {
		System.out.print(i);	
		}
		System.out.println("----");
		for(int a=100; a>=1; a-- ) {
		System.out.println(a);
		}
		for(int b=20; b>=1; b-=2) {
		System.out.println(b);	
		}
		//second way		
		for(int b=20; b>=1; b-=2) {
			if(b%2==0)
				System.out.println(b);	
		
		//second way
	    for (int d=20; d<=50; d+=3 ) {
	    System.out.println(d);	
	    }
        int e=20;
        while(e<=50) {
        System.out.println(e);
        e+=3;
        }
        // what is the output
        int sum=0;
        for(int i=1; i<=5; i++) {
        sum=sum+i;
        }
        System.out.println(sum);//
}}
}