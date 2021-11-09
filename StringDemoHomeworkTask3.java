package com.syntax.com13;

public class StringDemoHomeworkTask3 {

	public static void main(String[] args) {
	// //Create a String and print it in reverse order (Sunday → yadnuS).

	String day="Sunday";
String BackWard="";
	for (int i=6-1;i>=0;i--) {  // day.length()-1;
		BackWard+=day.charAt(i);
		
	}
	System.out.println(BackWard);
	
	}
}
	