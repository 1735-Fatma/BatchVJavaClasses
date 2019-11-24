package com.class20;

public class MySelf {
public static void main(String[]args) {

	  MySonMath son1 = new MySonMath();
      son1.name = "Ensar";
      son1.phone = "123-456-7890";
//    son1.SSN = "";  ulasilamiyor 
      son1.birthday = "01/01/2010";
      
      son1.add1();
      
	//all of these
	son1.add2(1,6);
	
	int result=son1.add3();
	System.out.println(result);
	
	int result4=son1.add4(3,7);
	//son1.add5();//this method is not visible
	
	if(result4==12) {
		System.out.println("Good job"+son1.name);
	}else {
		System.out.println("You are not good enaugh ,but it s ok");
	}
	
	MySelf mySelf=new MySelf();
	boolean good=mySelf.checkResult(12,result4);
	if(good) {
		System.out.println("good job");
	}else {
		System.out.println("you are not good enough");
	}
//boolean check=mySelf.checkResult(12, 12);
//System.out.println(check);
 //  }kendim yazdim dogru cikti
}
boolean checkResult(int myResult,int mySonResult) {
	boolean  isOk=false;
	if(myResult==mySonResult) {
	isOk=true;	
	}else {
		isOk=false;
	}
	return isOk;
}
}