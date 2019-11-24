package com.class21;

public class TaskStudent1 {
	//2. Create a Class called Students
	//● Create three variables studentName , studentID and numberOfStudents
	//● Create three objects of the Students Class
	//● Set the value for studentName , studentID and increment the numberOfStudents for each object
	//● Print out total number of students
	//benim cozdugum soru digeri hocaninki diger classta
	public String studentName;
	public int  studentID;
	public static int numberOfStudents;//burada 0
	
	public static void main(String[]args) {
		TaskStudent1 s1=new TaskStudent1();
		s1.studentName="ali";
		s1.studentID=345;
		TaskStudent1.numberOfStudents++;//burada 1
		
		TaskStudent1 s3=new TaskStudent1();
		s3.studentName="Seval";
		s3.studentID=456;
		TaskStudent1.numberOfStudents++;//burada 2
		
		TaskStudent1 s5=new TaskStudent1();
		s3.studentName="derya";
		s3.studentID=333;
		TaskStudent1.numberOfStudents++;//burada 3 oluyor
		
		System.out.println("the total number of student is: "+ TaskStudent1.numberOfStudents);
	}
}
