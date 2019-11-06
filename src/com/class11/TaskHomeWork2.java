package com.class11;

public class TaskHomeWork2 {

	public static void main(String[] args) {
// 1.Create an array of cars : american,german, korean, italian. Then retrieve all
// values from that array
//2.Create an array of countries: north america countries, south america countries,
//europe countries, asian countries, african countries. Then print all values from that array.
	//1	
	String [][] cars= {{"american","german"," korean","italian"},
	{"ford","wolvo","kia","mersedez"},
	};
	for(int i=0; i<cars[0].length; i++) {
	     System.out.println(cars[0][i]+" "+cars[1][i]);	
	}
	//2
	String[][]countries= {{"north america","south america","europe","asian","african"},
			{"cuba","Brazil","France"," Turkey","nigeria"}};
	
	for(int i=0; i<countries[0].length; i++) {
		System.out.println(countries[0][i]+ " "+countries[1][i]);
	}

	}
}
