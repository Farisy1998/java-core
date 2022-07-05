package evenoddnumbers;

public class EvenNumbersThread {
	public synchronized void printEvenNumbers(int number) {
		System.out.println("Printing even numbers: ");
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
