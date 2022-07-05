
public class Test {

	static ArrayIndexOutOfBoundDemo arrDemo;

	public static void main(String[] args) {
		try {
			Test.arrDemo.method1();
		}
		catch(NullPointerException npe) {
			System.out.println("The object of type ArrayIndexOutOfBoundDemo class is not pointed to a reference");
		}
	}

}
