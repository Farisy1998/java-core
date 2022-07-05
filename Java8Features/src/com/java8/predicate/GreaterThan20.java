package com.java8.predicate;

import java.util.function.Predicate;

public class GreaterThan20 {
	public static void main(String[] args) {
		Predicate<Integer> p = (i)->(i>20); 
	}
}
