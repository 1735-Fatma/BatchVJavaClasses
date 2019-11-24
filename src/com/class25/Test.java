package com.class25;

public class Test {
public static void main(String[] args) {
	System.out.println("create an object of a Employee class");
	Employee emp=new Employee();
	emp.salary=70000;
	Employee.companyName="Syntax";
	emp.vork();
	emp.getPaid();
	
	System.out.println("creating an object of scrum team");
	ScrumTeam sm=new ScrumTeam();
	sm.salary=90000;
	sm.vork();
	sm.getPaid();
	sm.artifacts="Product Backlog,sprint Backlog,burnDown chart";
	sm.ceremonies="Sprint demo,planning, retro,daily StandUp";
	sm.attendScrumMeetings();
	
	Developer dev=new Developer();
	dev.salary=130000;
	dev.vork();
	dev.getPaid();
	dev.code();
	dev.artifacts="Sprint Backlog";
	dev.ceremonies="Sprint demo,planning, retro,daily StandUp";
	dev.attendScrumMeetings();
	
}
}
