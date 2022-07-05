import java.util.Scanner;

public class PrintNumberUsingDoWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		int i = 1;
		do {
			if (i % 10 != 0) {
				System.out.println(i);
				i++;
			} else {
				i++;
			}
			if (i > 100) {
				break;
			}
		} while (i <= n);
	}

}
