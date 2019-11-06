package com.class14;

public class StringMethodRecap {

	public static void main(String[] argTs) {
		// .replace
        String str="your Syntax Technologies.is your place to study";
        System.out.println(str.replace('y', 'i'));
        
        System.out.println("***********");
        System.out.println(str.replace("your", "My"));
        System.out.println("***********");
        
        //.replaceAll
        String str2="Video provides a powerful way to help you prove your point. "
				+ "When you click Online Video, you can paste in the embed "
				+ "code for the video you want to add. ";
      
        System.out.println(str2.replaceAll("to(.*)", ""));//to dahil ,kalani  remove  
        System.out.println("************");
        
        String str3="23423Hell3049o^&*^&*$%$";
        System.out.println(str3.replaceAll("[0-9]",""));
        System.out.println(str3.replaceAll("[^a-zA-Z^]", ""));//^birincisini not olarak algiliyor digerini karacter
        
        System.out.println("************");
        System.out.println(str2.replaceFirst(" ", ""));//sadece birinciyi aldi
	}

}
