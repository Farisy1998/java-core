import java.util.Scanner;

public class PrintNumbersUsingFor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 10 == 0) {
				continue;
			}
			if (i > 100) {
				break;
			}
			System.out.println(i);
		}
	}

}
