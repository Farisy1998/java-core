package com.abstractclasses;

public abstract class Circle {
	
	int area;	// abstract class can have uninitialized variables, but not in interfaces
	Circle(int a) {		// abstract class can have constructor
		this.area = a;
	}
	public void area() {	// abstract class may or may-not have a non-abstract methods
		
	}
	public abstract void perimeter();	// abstract class, it is practical to hold a abstract method
	
	// If in a scenario, a class have a abstract method. Then the class must be
	// modified to the abstract class using the 'abstract' keyword.
}
