package com.class13;

public class ReplacemethodStringClass {

	public static void main(String[] args) {
		/*.replace
		 *this method returns a new string resulting 
		 *from  replacing all occurrences of oldChar 
		 *in this string with newChar.
		 */
		System.out.println("//\\");
		String str="Hello Dear Dan, how are you,How you been?";
		String str1="12-22-1990";//12/22/1990
		/*.replace() 
		 * This method returns a new string resulting  
		 * from replacing all occurrences of sequence of string  
		 * in this string with newCharsequence. 
		 * */
        System.out.println(str.replace('n','z'));
        System.out.println(str1.replace('-','/'));
        System.out.println(str1.replaceAll("-", "/"));
        System.out.println(str1.replaceFirst("-", "/"));
        
        System.out.println("-----------");
        System.out.println(str.replace("Dear Dan","Respected Ben"));
	    System.out.println(str.replaceFirst("Dan","Ali"));
        
	}}	    
