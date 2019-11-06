package com.class5;

public class NestedIfRecap {

	public static void main(String[] args) {
	/*verify if button is displayed on the page
	 * if button is displayed then we need to verify text on
	 * if text equal to sign in-->test case pass
	 * otherwise-->wrong text is displayed	
	 */
		
		boolean isDisplayed=true;
		String buttonText="Sign In";
		
		if(isDisplayed) {
			System.out.println("Button is Displayed");
			if(buttonText.equals("Sign In")) {
			System.out.println("test case button");
			}else {
		     System.out.println("wrong text is Displayed");		
			}
		}else {
			System.out.println("Button is not displayed");
		}
	}
}
