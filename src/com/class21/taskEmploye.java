package com.class21;

public class taskEmploye {
/*
 * 1. CreateaClasscalledEmployee:
   ● Create three variables eID , salary
   and set the CEO to “Sumair”
   ● Create two objects of the class
   Employee
   ● Set the value of eID, salary for each of
   the objects
   ● Print out the eID , salary and CEO for
   each of the objects
 * 
 * 
 */
	public static String CEO;
	int eID,salary;
	
	void disPlay(String name) {
	System.out.println(name+": eID is "+eID+" salary is "+salary+" ceo is "+CEO);	
	}
	public static void main(String[]args) {
	//sinif ismi .static variable	
	taskEmploye.CEO	="ali";
	taskEmploye	obj1=new taskEmploye();
	obj1.eID=111;
	obj1.salary=4000;
	//obj1.disPlay("zeki");ben ekledim
	taskEmploye	obj2=new taskEmploye();
	//taskEmploye.CEO	="ali";//kendinden onceki objeyi gormuyor kendisi nerdeyse sonraki objeleri etkiler
	obj2.eID=14;
	obj2.salary=3000;
	obj2.disPlay("Betul");
	
	}
}
