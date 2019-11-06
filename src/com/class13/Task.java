package com.class13;

public class Task {

	public static void main(String[] args) {
		/*Create a String and print it in reverse order(Sunday->yadnuS)
		 * ****mutlaka cikar interview de
		 */
	
		String day="Sunday";
		for(int i=day.length()-1; i>=0; i--) {
			System.out.print(day.charAt(i));
		}
		System.out.println();
		/* Create a String and if the String is not empty perform the following: if the 
		 * * String has an odd number of characters and has 3 or more characters,print 
		 * * the character in the middle of the String.
		 * 
		 */
		
		String str1="Hellourwewr";
		int length=str1.length();
		int middle=str1.length()/2;
		if(!str1.isEmpty()) {
			if(str1.length()%2!=0 && str1.length()>=3) {
			System.out.println(str1.charAt(middle));	
			}
		}
		
	}

}
