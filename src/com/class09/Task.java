package com.class09;

public class Task {

	public static void main(String[] args) {
		// 55555
		// 4444
		// 333
		// 22
		// 1  
        for(int a=5; a>=1; a--) {
        	for(int b=1; b<=a; b++) {
        	System.out.print(a);	
        	}
        	System.out.println();
            }
        System.out.println("#########");
        for(int a=1; a<=5; a++) {
        	for(int b=1; b<=a; b++) {
        	System.out.print("*");	
        	}
        	System.out.println();
            }
	    for(int x=5; x>=1; x--) {
	    	for(int y=1; y<=x; y ++) {
	    	System.out.print("*");	
	    	}
	    	System.out.println();
	    }
}
}
