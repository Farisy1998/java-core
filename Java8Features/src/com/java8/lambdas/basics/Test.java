package com.java8.lambdas.basics;

public class Test {

	public static void main(String[] args) {
		A a = ()->System.out.println("Inside myMethod()");
		a.myMethod();
	}

}
