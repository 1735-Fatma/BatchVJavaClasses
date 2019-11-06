package com.class13;

public class Recap2 {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello";
		
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1==str2);
		
		System.out.println("-----------");
		
		String str3=new String("Bye");
		String str4=new String("Bye");
		//String str4=str3;
		
		System.out.println(str3.equals(str4));//true
		System.out.println(str3==str4);//interview question bu ikisi arassindaki fark nedir
		
		System.out.println("-----------");
        System.out.println(str1.contains("zz"));
        System.out.println("-----------");
        
        String str5="Today is Saturday";
        System.out.println(str5.startsWith("Today"));
        System.out.println("day");
        
        System.out.println("......concat....");
        System.out.println(str5.concat("and we have java class"));
        
        System.out.println("......trim.....");
        String str6="   it is sunny    ";//basinda ve snunda ki boslugu kaldirir
        System.out.println("before triming: "+str6);
        System.out.println(str6.trim());
        
        System.out.println("...index of and CharAt...");
        String str7="Tomorrow we will be done with String Manipulation";
        
        System.out.println(str7.indexOf('E'));//bulamazsa -1 yaziyor
        System.out.println(str7.indexOf('e',11));//11 den sonra kontrol et
        System.out.println(str7.indexOf("we"));
        
        System.out.println(str7.charAt(10));
	}

}
