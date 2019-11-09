package com.class14;

public class interview {

	public static void main(String[] args) {
		//3.Find out how many alpha characters present in a string?
		String s="Ab@$^*12457He";
        System.out.println(s.replaceAll("[0-9]",""));
        
        //4.How to find out the part of the string from a string?
        //What is substring?Find number of words in string?
        
        String text="I am from Turkey ve i";
        //word count
        int counter=1;
        for(int i=0; i<text.length(); i++)
        {
            if(text.charAt(i)==' ' && text.charAt(i+1)!=' ') 
                counter++;
        }        
        System.out.println("Total number of words in string are: "+ (counter));
        //since last word does not contain and character after that
	}

}
