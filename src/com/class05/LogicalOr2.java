package com.class05;

public class LogicalOr2 {

	public static void main(String[] args) {
		// 7 days a week
				// if days is Tuesday or Thursday--> SDLC
				// if days Saturday or Sunday-->Java Class
				//if day Monday or Friday--> no class
				//if day is Wednesday--> review class
				
				String weekDay="Friday";
				if(weekDay.equals("Tuesday")|| weekDay.equals("Thursday")){
					System.out.println("SDLC class");
				}else if(weekDay.equals("Saturday ")|| weekDay.equals("Sunday")) {
					System.out.println("java class");
				}else if(weekDay.equals("Monday")|| weekDay.equals("Friday")) {
					System.out.println("no class");
				}else if(weekDay.equals("Wednesday")) {
		             System.out.println("Review class");
				}else {
					System.out.println("not a valid day");
				}
				
				

	}

}
