package com.class21;

public class Forest {
public static void main(String[]args) {

	Wolf obj1=new Wolf();
	obj1.color="Gray";
	obj1.age=3;
	Wolf.numberOfWolves++;
	
	Fox obj2=new Fox();
	obj2.color="White";
	Fox.numberOfFoxes++;
	
	
	
	Fox obj4=new Fox();
	obj4.color="Black";
	Fox.numberOfFoxes++;
	
	
	
	Bear obj3=new Bear();
	obj3.type="Polar"; 
	obj3.weight=150; 
	Bear.numberOfBears++;
	
	System.out.println("Forest has a "+obj1.color+" color "+obj1.age+" age "+Wolf.numberOfWolves+" Wolf");
	System.out.println("Forest has a "+obj3.type+" type "+obj3.weight+" weight "+Bear.numberOfBears+" Bears");
	System.out.println("Forest have "+Fox.numberOfFoxes+" foxes");
}
}
