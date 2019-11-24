package com.class24;
public class TaskBook {
/* 2.Write program as a Book class   that will have 2 Constructors.
 * While creating an object make sure:
 * Instance variables are being initializedBoth Constructors are being executed
 */
	String bookTitle;
	int page;
	TaskBook(){
		System.out.println("I am reading a book");
	}
	TaskBook(String bookTitle, int page){
		this();
		this.bookTitle=bookTitle;
		this.page=page;
	}
	public void display() {
		System.out.println("Title of the book :" + this.bookTitle + ", total page : "+ this.page);
	}
	public static void main(String[] args) {
		TaskBook obj=new TaskBook("Holes",314);
		obj.display();
	}
	
}
