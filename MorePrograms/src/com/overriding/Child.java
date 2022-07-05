package com.overriding;

public class Child extends Parent {
	String str = "Child";
	// we cannot override a static method in Parent class as non-static method in
	// Child class and vise-versa
	public static void doSomething() {
		System.out.println("Child method");
	}
}
