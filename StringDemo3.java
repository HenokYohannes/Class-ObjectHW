package com.syntax.com13;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String name="This class is easy";
	System.out.println(name.contains("class"));
	System.out.println(name.contains("Lemon"));
	System.out.println(name.contains("i"));
	
	
	String str2="Hello";
	String str3="helhyjhuylo";  // changed to see the results of line 29,30
	
	System.out.println(str2.equals(str3));
	
	System.out.println(str2.equals(str3)); // will false becasue of the lower syso because we ignoretheCase...case sesitive we chanhe from H to h
	System.out.println("------------------");
	System.out.println(str2.equalsIgnoreCase(str3));
	
	
	System.out.println(str2.charAt(4)); // it will tells you the character of the alphabet in the word
	System.out.println(str2.toUpperCase().charAt(4)); // change the out come of o to O
	
	
	System.out.println(str2.indexOf("e"));
	System.out.println(str3.indexOf('l',3)); // it starts to count after the first l
	System.out.println(str3.indexOf('l',str3.indexOf('l')+1)); //the same but not hardCoding

	
	
	
	System.out.println(name.substring(5));  // "This class is easy"
	System.out.println(name.substring(5,11));  // it starts from indexes
	
	
	
	}

}
