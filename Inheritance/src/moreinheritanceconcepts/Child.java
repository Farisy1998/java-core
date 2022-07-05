package moreinheritanceconcepts;

public class Child extends Parent {
	int c, d;

	Child(int a, int b, int c, int d) {
		super(a, b);	// The super method must be the first line, otherwise it 
						// will show error. Because the Parent's object is created 
						// initially before the child's object creation.
		this.c = c;
		this.d = d;
	}

	void display() {
		System.out.println("Parent's a: " + super.a);
		System.out.println("Parent's b: " + super.b);
		System.out.println("Child's c: " + this.c);
		System.out.println("Child's d: " + this.d);
	}

	void f1() {
		super.f1();
		System.out.println("Inside Child's f1()");
	}
}
