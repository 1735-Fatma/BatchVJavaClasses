package com.class17;

public class ObjectOfComputerClass {
public static void main(String[]args) {
	Computer computer1=new Computer();
	computer1.name="McBook";
	computer1.brand="Apple";
	computer1.screen=15;
	computer1.memory=250;
	
	System.out.println("my "+computer1.name+" has "+computer1.screen+" screen");
	
}
}
