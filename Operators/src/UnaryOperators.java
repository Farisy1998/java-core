
public class UnaryOperators {

	public static void main(String[] args) {
		int x = 10;
//		int y = ++x;	// pre-increment
		int y = x++;	// post-incement
		System.out.println("Value of x is: "+x+"\nValue of y is: "+y);
		
		int a = 1000;
//		int b = --a; // pre-decrement
		int b = a--; // post-decrement
		System.out.println("Value of a is: "+a+"\nValue of b is: "+b);
	}

}
