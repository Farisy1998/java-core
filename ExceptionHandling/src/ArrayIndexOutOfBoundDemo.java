
public class ArrayIndexOutOfBoundDemo {

	void method1() {
		System.out.println("Inside method1()");
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		try {

			System.out.println("Elements of the array are: ");
			for (int i = 0; i <= 4; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException arre) {
			System.out.println("The array iteration index is out of it's bounds");
		}
		System.out.println("More codes go here");
	}

}
