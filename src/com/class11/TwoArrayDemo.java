package com.class11;

public class TwoArrayDemo {

	public static void main(String[] args) {
		 String[][] names= {
				 {"Khan","yusuf","Alex","Zynap"},
				 {"muhammed","ann","neslihan","wegas"},
				 {"diago","asif","zubair","shogofa"}
		 };
          int lengthOfRows=names.length;
          System.out.println(lengthOfRows);
          
          int lengthOfCols=names[1].length;
          System.out.println(lengthOfCols);
          
          for(String getArrays[]: names) {
        	  for(String getName: getArrays) {
        		  System.out.print(getName+" ");
        	  }
        	  System.out.println();
          }


}}
