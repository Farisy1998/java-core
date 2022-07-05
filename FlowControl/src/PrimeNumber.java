import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean primeFlag = true;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				primeFlag = false;
			}
		}
		if (primeFlag) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println(n + " is not a prime number.");
		}
	}

}
