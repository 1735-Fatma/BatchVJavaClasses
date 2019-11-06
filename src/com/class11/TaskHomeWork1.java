package com.class11;

public class TaskHomeWork1 {

	public static void main(String[] args) {
//1) Create a 2D array where you will store the following values:
// Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama. After storing values print the following:
// Mrs Smith, Mr Obama, Ms Jackson, MissJordan.
		
//2)Create a 2D array that first row will contain 4 names and second row will contain grades.
//Then you program should print name of the students that has as anA and B grade

		String[][] n= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"},
		};          //1de olabilirdi
	for(int i=0; i<n[0].length; i++) {
			System.out.println(n[0][i]+" "+n[1][i]);
	     }
	 String[][] arr= {
			 {"john","Smith","Jordan","Jackson"},
			 { "A " ,"B","A"  ,"B" }                
	                };
             for(int a=0; a<arr[0].length; a++) {
            	System.out.println(arr[0][a]+" "+arr[1][a]); 
             }
}}
