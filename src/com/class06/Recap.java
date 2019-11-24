package com.class06;

public class Recap {

	public static void main(String[] args) {
		/*declare the time (1-24)
		 * based on the time identify whether it morning, afternoon, evening or
		 * if 1-11--> morning
		 * if 12-15-->noon
		 * if 16-20-->evening
		 * if 20-24->night
		 */ 
		int time=33;
		String timeOfDay=null;
		
		if(time>=1  && time<=11) {
			timeOfDay="morning";
		}else if(time>=12 && time<=15) {
			timeOfDay="noon";
		}else if(time>16 && time<=20) {
			timeOfDay="evening";
		}else if(time>=20 && time<=24) {
			timeOfDay="night";
		}else {
			System.out.println("your entry is invalid");
			timeOfDay="invalid";
		}
		System.out.println("time of the day is "+timeOfDay);
		
		
		}
		

	}


