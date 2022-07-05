
public class MultilevelTest {
	public static void main(String[] args) {
		Child child = new Child();
		// child.f1();
		// child.f2();
		child.hashCode();   // The Child class gets the hashCode() method through
							// it's Parent class
	}
}
