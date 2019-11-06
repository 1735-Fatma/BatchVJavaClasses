package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {
		/*
		 * print only text and not numbers 
		 */
		String str="14234Hel45645lo465456";//Hello
		
        System.out.println(str.replaceAll("[0-9]",""));//leave only text 0 dan 9 a kadar olan sayilari boslukla
        //degistir demek yani yok say
        System.out.println(str.replaceAll("[a-zA-Z]",""));//leave only numbers 1423445645465456
        
        //Remove everything except text and numbers
        String str2="Hi#$%How#$%#$4356346";
        System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));//^not disindaki anlaminda
        		
        System.out.println(str2.replaceAll("\\w", ""));//word kelime disindakileri al demek bu sekilde yaziliyor
        System.out.println("---------");
        
	}

}
