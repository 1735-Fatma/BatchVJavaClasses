package com.class14;

public class StringMinipRecap {

	public static void main(String[] args) {
		String str=new String("Hello");
		String str3=new String("Hello");///coooook onemli   memory different
		System.out.println(str==str3);//no not  equal
		
		System.out.println("***********");
		
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);//yes they are same         memory same
		System.out.println(str);
        String str2=str.replaceAll("Hello", "Bye");///coooook onemli 
        System.out.println(str2);
	}

}