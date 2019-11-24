package com.class04;

public class NestedIfMore2 {
public static void main(String[]args) {
                               
                                
	/* we need to check if student completed the quiz 
	 * * if yes--> good job, if not --> not good 
	 * * if they completed we will check score: 
	 * * if more than 90--> you got an A 
	 * * if more than 80--> you got a B 
	 * * anything below --> you should study more
	 * */boolean quiz=true;
	 int score =85;
	 if (quiz) {
		 System.out.println("Good job you tried to do quiz!!!");
		 if (score>=90) {
			 System.out.println("You got an A");
		 }else if (score >80) {
			 System.out.println("You got a B");
			 }else {
				 System.out.println("You should study more");	
	 }}else {
	 System.out.println("Not good !!!");				
	 }}
	
	
	
	
}
