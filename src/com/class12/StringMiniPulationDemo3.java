package com.class12;

public class StringMiniPulationDemo3 {

	public static void main(String[] args) {
		// this method checks whether a String is empty or not
		//this method returns true if the given string
		//is empty else it returns false
		
		String str="";
		System.out.println("is this string empty=\n"+str.isEmpty());
		String str2="hello";
		System.out.println("is this string empty="+str2.isEmpty());
        System.out.println();
        
        // if(!str.isEmpty()){
        //System.out.println("this is not empty");
	    //}else {
		//System.out.println("this empty String");
	    //}
              String sentence="Each day has a promise to brighten up the day,\nBut "
        		+ "first you must allow the sun to come your way";
               System.out.println(sentence);
        /*
         * this method appends one string to the end of another
         * the method  returns a string  with the value of the
         * string passed in to the method appended to the end
         * of the string used to invoke this method
         */
	   String str3="hello";
	   String str4="World";
	   String str5="people";
	   System.out.println(str3+str4+str3);
	   System.out.println(str3.concat(str4).concat(str5));
	   /* * This method returns a copy of the string,  
	    * * with leading and trailing whitespace omitted. 
	    * */
	   String str6="   How i   are you? ";
	   System.err.println(str6.trim());
	   System.out.println("*******************");
	   /* 
	    * * This method returns the character located at the String's specified 
	    *   index.  
	    *   * The string indexes start from zero. 
	    *   */
	   String str7="We might be done early today";
	   System.out.println(str7.charAt(3));
	   System.out.println("*******************");
	   /* * This method returns the index within this string of the  * 
	    *   first occurrence of the specified character or -1  *
	    *   if the character does not occur. */
	         String str8="We might mnot be done early";
	         System.out.println(str8.indexOf('m'));
	         System.out.println(str8.indexOf('z'));
	         
	         
	    
	}

}
