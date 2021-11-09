package com.syntax.com13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="";
		//System.out.println(name.isBlank()); in other Java Versions
		System.out.println(name.isEmpty());
	name="Muzit";
	
	System.out.println(name.isEmpty());
	
	
	
	String str="       Batch 11 is .....";  // it removes the space before (leading) & spaces last character (tail)
	
	System.out.println(str.trim());
	
	
	String str2= "This is a easy class";
	
	System.out.println(str2.startsWith("T"));  //(str2.toLowerCase().starsWith("t"); this way we can change toLowerCase & then check if the String starts with "T"
	System.out.println(str2.startsWith("This"));
	
	System.out.println(str2.startsWith("L"));
	System.out.println(str2.endsWith("str2"));
	System.out.println(str2.endsWith("s"));
	}

}
