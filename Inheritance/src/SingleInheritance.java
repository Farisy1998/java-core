
public class SingleInheritance {
	void m1() {
		System.out.println("Inside m1()");
	}

	public static void main(String[] args) {
		SingleInheritance single = new SingleInheritance();
		single.m1();
		single.hashCode();
		single.getClass();
	}
}
