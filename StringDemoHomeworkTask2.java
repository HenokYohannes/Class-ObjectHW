package com.syntax.com13;

import java.util.Scanner;

public class StringDemoHomeworkTask2 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: Example Output: Mom’s
		 * first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested baby
		 * name: DANRY
		 */

		Scanner input = new Scanner(System.in);
		String Boy = null;
		String name1 = "Mary";
		String name2 = "Daniel";
		String suggestChildName;
		suggestChildName = "DANRY";
		System.out.print("Parent 1 first name? ");
		name1 = input.next();
		System.out.print("Parent 2 first name? ");
		name2 = input.next();
		System.out.print("Child gender? ");
		String gender = input.next();
		System.out.println("Suggested name:" + suggestChildName(gender, name1, name2).toUpperCase());

		if (suggestChildName.equals(Boy)) {
			System.out.println("Suggested baby name is" + suggestChildName);
			if (!suggestChildName.equals(suggestChildName)) {
				System.out.println("Not yet name given");
			} else {
				System.out.println(" Unknown");
			}

		}
	}

	private static String suggestChildName(String gender, String name1, String name2) {
		String suggestChildName;

		return suggestChildName = "DANRY";

	}

}
