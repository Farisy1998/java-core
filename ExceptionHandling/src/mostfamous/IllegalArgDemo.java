package mostfamous;

public class IllegalArgDemo {

	public static int sum(int a, int b) {
		if (a == 0 || b == 0) {
			throw new IllegalArgumentException("Both a and b should not be 0");
		}
		return a+b;
	}

	public static void main(String[] args) {
//		Thread thread = new Thread();
//		thread.setPriority(11); // IllegalArgumentException will raise
		System.out.println(sum(0,0));
	}

}
