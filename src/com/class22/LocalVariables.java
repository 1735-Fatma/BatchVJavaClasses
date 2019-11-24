package com.class22;

public class LocalVariables {

	public static void main(String[] args) {
		//i want to acccess variable MyName from different method
		LocalVariables obj=new LocalVariables();
		obj.sayName();
	//wont be accesible scope is only within sayName method 
	//System.out.println(myName);
		String useremail=obj.createEmail("john","smith","outlook");
        
	}
void sayName() {
	String Myname="John";
	System.out.println(Myname);
	//-->wont  be accesible       burasi eksik
}
String createEmail(String name,String lastName,String email) {
	String userEmail=name+lastName+"@"+email+".com";
	return userEmail;
}
}
