package moreinheritanceconcepts;

public class ChildClass extends SuperClass {
	public ChildClass() {
		this(10);
		System.out.println("No arg ChildClass constructor");
	}

	public ChildClass(int x) {
		super(x);
		System.out.println("One arg ChildClass constructor");
	}

	public static void main(String[] args) {
		ChildClass child = new ChildClass();

	}
}
