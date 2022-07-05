package evenoddnumbers;

public class OddNumbersThread {
	public synchronized void printOddNumbers(int number) {
		System.out.println("Printing odd numbers: ");
		for (int i = 1; i <= number; i++) {
			if (!(i % 2 == 0)) {
				System.out.println(i);
			}
		}
	}
}
