package com.class12;

public class StringMiniPulationDemo {

	public static void main(String[] args) {
		
		//There  are two ways to create string objects
		//1
		//String literal
		String name="John";
		System.out.println(name);
		System.out.println("The length of name is="+name.length());
		
		//2
		//Creating String with new key word
		String name1=new String("John1");
		System.out.println(name1);
		
		//.length
		/*this method returns the length of this string
		 *the length is equal to the  number 
		 *of 16 -bit unicode characters in the string       cooook onemli soru
		 */
		int name1Len=name.length();
		System.out.println("The length of name1Len is="+name1Len);
		System.out.println("##########");
		
		/* * toLowerCase(); 
		 * * This method converts all of the  
		 * * characters in this String to lowercase  
		 * */
		String str1="HelLo woRld";
		System.out.println("Before:: "+str1);
		str1 = str1.toLowerCase();
		System.out.println("After:: "+str1);
		System.out.println("=================");
		
		//.equals()
        //This method will count everything such
        //capitalization and content
         String str2="HElLo WoRld";
		
         boolean isEqual=str1.equals(str2);// birebir ayni istiyor
         System.out.println(isEqual);
		
		//.equalsIgnoreCase();
        //This method does not care for capitalization and compare the
        //content only
		System.out.println(str1.equalsIgnoreCase(str2));//buyuk kucuk farketmez ayni karacter yeterli
		 /*
         * toUpperCase();
         * This method converts all of the characters in
         * this String to uppercase
         */
		String str3="Mohammad";
		System.out.println("Bofore ::"+str3);
		str3=str3.toUpperCase();
		System.out.println("After::"+str3);
	}
}
