package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		/*
		 * .split
		 * this method splits this string around matches of the given regular expression
		 */
		//split the following string into array 
		String str="Video provides a powerful way to help you prove your point";
        System.out.println();
        String[] array=str.split("\\s ");
        for(int i=0; i<array.length; i++) {
        	System.out.println(array[i]);	
        }
        System.out.println("************");
        //How can we find how many sentences are in the following string;
        String str1="Today is Sunday.Its sunny day.and we are haveing  java class";
        String[] array2=str1.split("\\.");//. tan sonrasini ayri ayri cikariyor.3 cumle old.gosterdi
        
        System.out.println("The number of Sentences in the given String is::"+array2.length);
        for(String string:array2) {
        	System.out.println(string);
        }
        
	}

}
