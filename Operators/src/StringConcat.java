
public class StringConcat {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "xyz";
		int a = 10, b = 20, c = 30;
		System.out.println(a+b+c);
		System.out.println("String concatination: " + s1 + s2);
		System.out.println(a+b+s1+c);	// the println method evluate its expression
										// from left to right.
	}

}
