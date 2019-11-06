package com.class11;

public class TaskOf2DArray {

	public static void main(String[] args) {
//1)Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
//  Develop a program which will identify/print the even numbers only.
		
//2)Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
//3)Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.	

	//int [][]arr= {{1,2,3,4},
	//		        {5,6,7,8},
	//		        {1,3,8,1},	        
	
	//};
	//for(int i=0; i<arr.length; i++) {
	//	for(int j=0; j<arr[i].length; j++) {	
		
	//	System.out.print(arr[i][j]+" ");
	//	}
	//}
	//3
	//int
	//for(int i=0; i<arr.length; i++) {
	//	for(int j=0; j<arr[i].length; j++) {
	//		System.out.print(arr[i][j]+" ");	
	//	}
	//}
		   int[][] numbers = {
	                { 8, 7, 5, 3 },
	                { 1, 5, 6, 7 },
	                { 3, 6, 8, 1 }
	                };
	        
	        int sum=0;
	        for (int i = 0; i < numbers.length; i++) {
	            for (int j = 0; j < numbers[i].length; j++) {
	                //System.out.print(numbers[i][j] + ” “);
	                
	                sum=sum+numbers[i][j];
	            }
	            System.out.println();
	        }
	        System.out.println("The sum of all elements in the array is= "+sum);
	        
	        int sum1=0;
	        for(int nums[]: numbers) {
	            for(int getNum:nums) {
	                if(getNum%2==0) {
	                    System.out.println(getNum+" Is Even Number");
	                }
	                sum1=sum1+getNum;
	            }
	        }
	        System.out.println("The sum of all elements in the array is= "+sum1);
	   //3)
	    int [][] n= {
	    		{1,2,3,4},
	    		{5,6,7,8},
	    		{9,10,11,12},
	           };
              for(int i=0; i<n.length; i++) {
            	  for(int t=0; t<n[i].length; t++) {
            		  System.out.print(n[i][t]+" ");
                  }	    
              }
}}
