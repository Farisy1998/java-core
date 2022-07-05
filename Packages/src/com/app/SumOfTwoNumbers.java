package com.app;

import java.util.Scanner;
import static java.lang.System.*; // static import
import static java.lang.Integer.parseInt; // static import
import static java.lang.Math.*;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(in);
		out.println("Enter two numbers: ");
		// int num1 = scanner.nextInt();
		// OR
		int num1 = parseInt(scanner.next());
		int num2 = parseInt(scanner.next());
		out.println("Sum is: " + (num1 + num2));

		System.out.println(sqrt(11));
		System.out.println(ceil(3.4));
		System.out.println(floor(3.6));
		System.out.println(abs(23.5));
	}

}
