package finalkeywordconcepts;

public class A {
	final static double PIE = 3.14D;
	
	public final void display() {
		System.out.println(A.PIE);
	}
	
	A() {
		//PIE = 3.25;
	}
	public static void main(String[] args) {
		final A a1 = new A();
		System.out.println(A.PIE);
		// a1 = new A();
		// a1.PIE = 3.25;
	}
}
