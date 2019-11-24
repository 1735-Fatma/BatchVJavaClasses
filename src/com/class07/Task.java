package com.class07;

public class Task {

	public static void main(String[] args) {
	/*Create a boolean variable workDay and assign true create 
	 * int variable day and assign it to 1
	 * â—?As long as it is workDay print â€œI need a day offâ€? and increase day.
	 * â—?Once day is 6 or 7 print â€œI do not need a day off any moreâ€?	
	 */
     boolean workDay=true;
     int day=1;   	 
     while(workDay){
    	 
    	 if(day==6 ||day==7) {
    		 workDay=false;
    		 System.out.println("i do not need a day of anymore");	        	
    	 }else {
    	     System.out.println("i need a day off");     
    	 }    	
    	day++; 
         }
	}}


