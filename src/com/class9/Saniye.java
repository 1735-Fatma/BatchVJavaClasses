package com.class9;

public class Saniye {

	public static void main(String[] args) {
	        // military hours with seconds
	        for (int h = 0; h <= 24; h++) {
	            for (int m = 0; m <= 59; m++) {
	                for (int s = 0; s <= 59; s++) {
	                    if (m < 10) {
	                       System.out.println(h + ":0" + m + ":" + s);
	                    } else if (s < 10) {
	                        System.out.println(h + ":" + m + ":0" + s);
	                    } else {
	                        System.out.println(h + ":" + m + ":" + s);
	                    }
	                }
	            }
	        }
	}	    
	
}
	


