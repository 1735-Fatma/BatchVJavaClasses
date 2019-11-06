package com.class5;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		// Write a program that will read three inputs of scores (quiz, mid term, and final
		// scores) and determine the grade based on the following rules: 		
     	// if the average score >=90 → grade=A
		// if the average score >= 70 and <90 → grade=B
		// if the average score>=50 and <70 → grade=C
		// if the average score<50 → grade=F


	
        Scanner scan=new Scanner(System.in);
		System.out.println("what is your quiz note");
        int quiz=scan.nextInt();
        
        System.out.println("what is your mid term note");
        int midTerm=scan.nextInt();
        System.out.println("what is your final note");
        int finalNote=scan.nextInt();
        
        int averageScore=(quiz+midTerm+ finalNote)/3;
        String grade;
        if(averageScore>=90) {
        	grade="A";
        	//System.out.println("grade A");
        }else if(averageScore>=70 && averageScore<90) {
        	grade="B";
        	//System.out.println("grade B");
        }else if(averageScore>=50 && averageScore<70) {
        	grade="C";
        	//System.out.println("grade C");
        }else if(averageScore<50) {
        	grade="F";
        }	//System.out.println("grade F");
        else {
        	grade = "failed";	
        }
        System.out.println("Your score average is "+averageScore +" and Your grade is "+grade);
	}      	
}    	
        	
        	
        
        
        
        
        
        
	
