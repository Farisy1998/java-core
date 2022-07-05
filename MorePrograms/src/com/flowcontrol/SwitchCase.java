package com.flowcontrol;

public class SwitchCase {

	public static void main(String[] args) {
		int a = 10;
		final int b = 20;
		switch (a) {
		case 10:
			System.out.println("Case 10");
			break;
		case b: // we can only use contands instead of actual values not direct variables
			System.out.println("Case 20");
			break;
		case 30:
			System.out.println("Case 30");
			break;
		default:
			System.out.println("No matches");
		}
	}

}
