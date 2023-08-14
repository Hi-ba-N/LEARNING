package controlConstruct;

import java.util.Scanner;

public class ControlConstruct {
public static void main(String[]args ) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter your marks:");
int marks=scan.nextInt();
scan.close();
System.out.println("Welcome to Kodnest");
check( marks);
}
public static void check(int marks) {
	      if( marks>=80)
			{
		      System.out.println("Welcome to Techclub");
			}
}

}
