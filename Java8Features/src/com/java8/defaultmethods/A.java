package com.java8.defaultmethods;

public interface A {
	// Due to the m1() method is a default method, we did not want to implement it's 
	// body inside another implemented class body. Because the default method will have
	// its implementation inside it's interface itself.
	// default methods are allowed only in interface with an implementation.
	default void m1() {
		System.out.println("m1() inside class A");
	}
}
