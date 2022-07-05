package com.java8.lambdas.simple;

public class Test {

	public static void main(String[] args) {
		MyFunctionalInterface funInterface = () -> System.out
				.println("Indise the myMethod of MyFunctionalInterface class");
		funInterface.myMethod();
	}

}
