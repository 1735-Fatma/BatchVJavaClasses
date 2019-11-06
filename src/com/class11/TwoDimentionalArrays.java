package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		// Declare 2D Array  row colums
		int[][] array=new int[3][4];
		
		//1st row
		array[0][0]=44;
		array[0][1]=80;
		array[0][2]=33;
		array[0][3]=20;
		
		//2 nd row
		array[1][0]=10;
		array[1][1]=5;
		array[1][2]=7;
		array[1][3]=8;
		
		//3rd
		array[2][0]=10;
		array[2][1]=9;
		array[2][2]=70;
		array[2][3]=8;
		System.out.println(array[1][3]);
		
		//task:create  an 2D array of String with 2 and 3 colums.
		//and print value in second  row and 3rd column
		String[][] arr=new String[2][3];
		arr[1][2]="red";
		System.out.println(arr[1][2]);   // size sayarken 1den basliyoruz ama elementte 0 dan baslariz
		System.out.println("#######");
		int[][] numbers= {
				{8,7,9,3,8},
				{1,5,6,4,9,6},
				{3,6,8,0,7}
		      };
		
		
       System.out.println("the value in index 1 and 4 is "+ numbers[1][4]);//9
       //to identify the numbers of rows
		System.out.println("the numbers of rows are:="+numbers.length);//3
		
		//to identify the numbers of colums/elements in that row
		System.out.println("the numbers of colums are:="+numbers[1].length);//6
		
		 System.out.println("#####");
		 
		 
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			 System.out.println();
		}
	    

}}
