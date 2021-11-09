package com.syntax.com13;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String name =new String ("myk1");  //   if String name=null
	String name1="Henok"; // got 5 characters
	
	name.length();
	System.out.println(name.length());// it returns the number of characters inside the Sting Myk1 as integer (4)
	System.out.println(name1.length()); // printing the name
	System.out.println(name+" "+name1);
	
	
	System.out.println(name1.toLowerCase());
	System.out.println(name.toUpperCase());
	
	String str="This is easy 123  &*&%4";
	System.out.println(str.toLowerCase());
	
	
	System.out.println(name.concat(name1)); // not recommended to use.because if one of the names is not initalised or initialised to null then
	                                        // we will have name+null will be printed out
	
	
	
	int number=10;
	System.out.println(name+name1+number);

	//System.out.println(name.concat(name1).concat(number));// This way you can not cocate different datatype
	}

}
