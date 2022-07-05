package com.interfaces;

public class MyCircle implements Circle,Circle2 {

	public static void main(String[] args) {
		MyCircle myCircle = new MyCircle();
		myCircle.calculateArea();
	}

	@Override
	public void calculateArea() {
		System.out.println(Circle2.pie);
	}

}
