package com.overriding;

public class Overriding {

	public static void main(String[] args) {
		Parent.doSomething();
		Child.doSomething();
		Parent p = new Parent();
		System.out.println(p.str);
		Child c = new Child();
		System.out.println(c.str);
		
		Parent c1 = new Child();
		System.out.println(c1.str);
	}

}
