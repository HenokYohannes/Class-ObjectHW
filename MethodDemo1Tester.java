package com.syntax.com13;

import java.util.Arrays;

public class MethodDemo1Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		MethodDemo1 obj=new MethodDemo1();
	//obj.add (10,10);
	//System.out.println(obj.add(10,10));
	
	int[]array= {10,10,10};
	array=obj.doubleArray(array);
	
	System.out.println(Arrays.toString(array));
	}

}
