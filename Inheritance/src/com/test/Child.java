package com.test;

public class Child extends Parent {
	// Even we didn't placed a default constructor inside the Child class, the
	//  JVM will defaultly create a constructor internally for Child class when
	// we invoked it.
	//
	// The JVM will create a default constructor, which will look like:-
	//
	// Child() {
	// 		super();
	// }
}
