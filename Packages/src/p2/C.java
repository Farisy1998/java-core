package p2;

import p1.A;
import p1.p3.E;

public class C {

	public static void main(String[] args) {
		p1.A.a1();
		// OR
		A.a1();
		A obj = new A();
		obj.a2();
		// OR
		p1.A obj2 = new p1.A();
		obj2.a2();

		E eObj = new E();
		eObj.e1();
	}

}
