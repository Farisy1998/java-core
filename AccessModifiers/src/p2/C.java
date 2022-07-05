package p2;

import p1.A;

public class C extends A {
	public static void main(String[] args) {
		A aObj = new A();
		System.out.println(aObj.d);
		C cObj = new C();
		System.out.println(cObj.c); // The protected fields in the class A will be 
									// inherited in class C and can be accessed in 
									// class C if and only if we created an object for class C
	}
}
