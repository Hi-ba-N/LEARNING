package doubbleTrouble;

import java.util.Scanner;

public class DoubleTrouble {


		public static void main(String[]args) {

	Scanner scan=new Scanner(System.in);

	System.out.println("Ënter the number:");

	int num1=scan.nextInt();

	System.out.println(doubleTheNumber( num1));

	}

	public static int doubleTheNumber(int num1)

	{

		return num1*2;

	}

	}

