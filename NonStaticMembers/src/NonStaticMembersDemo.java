public class NonStaticMembersDemo {
	int num; // non-static variable

	// constructor
	NonStaticMembersDemo() {
		System.out.println("Inside the constructor");
	}

	// non-static block
	{
		System.out.println("Inside non static block");
	}

	void display() {
		System.out.println("Inside display()");
	}

	public static void main(String[] args) {
		System.out.println("Inside main()");
		NonStaticMembersDemo obj = new NonStaticMembersDemo();
		obj.num = 100;
		System.out.println(obj.num);
		obj.display();
	}

	static {
		System.out.println("Inside static block");
	}

}
