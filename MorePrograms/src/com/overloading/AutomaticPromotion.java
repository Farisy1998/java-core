package com.overloading;

public class AutomaticPromotion {
//	public void print(int i) {
//		System.out.println("Integer version: " + i);
//	}

//	public void print(float f) {
//		System.out.println("Float version: " + f);
//	}

//	public void print(String str) {
//		System.out.println("String version: " + str);
//	}

	public void print(Object obj) {
		System.out.println("Object version: " + obj.getClass());
	}

	public static void main(String[] args) {
		AutomaticPromotion ap = new AutomaticPromotion();
		ap.print(123);
		ap.print(10.5F);
		ap.print("Hello");
	}
}
