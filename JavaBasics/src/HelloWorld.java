
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	// static blocks
	static {
		System.out.println("In static block 2");
	}

	static {
		System.out.println("In static block 1");
	}
}
