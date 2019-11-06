package com.class12;

public class MethodImportant {

	public static void main(String[] args) {
		/*
		 *this method returns a copy of the string 
		 * with leading and trailing whitespace omitted
		 * sondaki yada bastaki bosluklari almadan cikartir
		 */
		String str6="   how are you?";
		System.out.println(str6.trim());
		
		/*
		 * this method returns the character located at the String s specified index 
		 * the string indexes start from zero
		 * 
		 */
		String str7="We might be done early today";
		System.out.println(str7.charAt(3));
		/*
		 * this method returns the index within this string of the
		 * first occurence of the specified character or -1
		 * if the character does not occur
		 * karacter yoksa -1 cikar
		 * kacinci sirada oldg. bulur 0 dan baslayarak
		 */
		String str8="we might mnot be done early";
		System.out.println(str8.indexOf('m'));
		System.out.println(str8.indexOf('m',4));//buradaki sayi bundan sonra nereye gitmen gerektigini gosterir
		//yani 4 ten baslayarak m ariyorbulamazsa -1 yaziyor
	}

}
