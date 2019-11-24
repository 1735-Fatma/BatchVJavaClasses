package com.class20;

public class Task1PrimeReversed {
//	Create a method that will take 1 parameter as a String and return reversed String.
//	Method should be visibly only within same package.
	
//  Create a method that will take a String and return whether String is palindrome or not.
//	Method should be available to all classes within your projects.
	
//  Create a method that will take a string and return an array of words from that string.
//	Method should be available only within same class
String reverseString(String param) {
	String result="";
char[] charArray=param.toCharArray();
for(int i=charArray.length-1;i>=0; i--) {
	result+=charArray[i];
}
    return"reversed string";	
}
//2
boolean isPalindrome(String param) {
	boolean result=false;
	String reverse=reverseString(param);
	if(param.equalsIgnoreCase(reverse)) {
		result=true;
	}else {
		result=false;
	}
	return result;
}
private String[] arrayOfWords(String sentence) {
//  String[] stringArray;
//  stringArray = sentence.split(" ");
//  return stringArray;
    return sentence.split(" ");
}
public static void main(String[]args) {
//1	
	Task1PrimeReversed task=new Task1PrimeReversed();
	String result=task.reverseString("Syntax");
	System.out.println(result);
//2	
	String str="elion";
	boolean result2=task.isPalindrome(str);
	System.out.println("Is\""+str+"\"Palindrome?"+result2);
	
//3
	String[] strArray = task.arrayOfWords("What a beautiful day is today!");
    System.out.println("The length of the array is: " + strArray.length);
    for (String word : strArray) {
        System.out.println(word);
    }
}
}
