import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a, b, c;
		try {
			System.out.println("Enter two integers: ");
			Scanner obj = new Scanner(System.in);
			a = obj.nextInt();
			b = obj.nextInt();
			c = a / b;
			System.out.println("Result: " + c);
		} catch (RuntimeException re) {
			System.out.println("Division by zero is not possible!");
		} finally {
			System.out.println("Inside finally block");
		}
		System.out.println("More code can go here");
	}

}
