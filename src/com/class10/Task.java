package com.class10;

public class Task {
	public static void main(String[]args){

//Create an array of chars and store grades into it: A,B,C,D,E,F.
//  Then print a grade B (use 2 different ways of creating an array).


 //Create an array of names and store all names of your group.
 //Then print your name from that array.
 // (use 2 different ways of creating an array).


 // Create an array of words: Java, Saturday, day, coding, is.
  //Print the following sentence using element of array:
  //“Saturday is Java coding Day”. 


 char[] grades=new char[4];
        grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		 System.out.println(grades[1]);
//second
		 //       0    1   2   3   4   5
	char[]grade= {'A','B','C','D','E','F'};	 
	int a=2;
	System.out.println(grade[4]);
	System.out.println(grade[a]);
	a+=2; //2+2
	System.out.println(grades[a]);
	a--;//3
	System.out.println(grades[a]);
	
	//System.out.println(grades[0]);
	//System.out.println(grades[1]);
	//System.out.println(grades[2]);
	//System.out.println(grades[3]);
	for(int  i=0; i<grades.length; i++) {
	System.out.println(grades[i]);
	}
	System.out.println("__________-");
	String[]animals= {"cat","dog","cow","snake","elephant"};
	int size=animals.length;
	for(int i=0; i<size; i++) {
	System.out.println(animals[i]+" ");	
	}
	// create an array to store 5 double  values, print all in 1 line
	double[]num=new double[5];
	num[0]=1.2;
	num[1]=1.3;	
	num[2]=1.4;
	num[3]=1.5;
	num[4]=1.6;
	int size1=num.length;
	for(int i=0; i<size1; i++) {
		System.out.println(num[i]+" ");
	}
	System.out.println();
 //task2
	String[]names=new String[4];
	        names[0]="Ayla";
			names[1]="Zehra";	 
			names[2]="Kerem";
			names[3]="nur";
			System.out.println(names[0]+" " +names[1]+" "+names[2]+" "+names[3]);
 //task3
	String[] words=new String[5];
	        words[0]="Java";
			words[1]="Saturday";		
			words[2]="day";
			words[3]="coding";
			words[4]="is";
			System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	}
}
 
 