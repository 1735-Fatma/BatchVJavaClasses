package com.class7;

public class Task {

	public static void main(String[] args) {
	/*Create a boolean variable workDay and assign true create 
	 * int variable day and assign it to 1
	 * ●As long as it is workDay print “I need a day off” and increase day.
	 * ●Once day is 6 or 7 print “I do not need a day off any more”	
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


