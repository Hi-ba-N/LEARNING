package com.methods.methodprogramming2;

import java.util.Scanner;

public class GreetPerson2 {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter Your Name and Year of Birth");

		String name=scan.nextLine();

		int yob=scan.nextInt();

		greet(name);

		int res=calculateAge(yob);

		System.out.println("You Are "+res+" Year old");

		}

		public static void greet(String name)

		{

		System.out.println("Hello "+name);

		}

		public static int calculateAge(int yob)

		{

		return 2023-yob;

		}

		
}
