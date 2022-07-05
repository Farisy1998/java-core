package evenoddnumbers;

public class EvenOddDemo implements Runnable {

	EvenNumbersThread even = new EvenNumbersThread();
	OddNumbersThread odd = new OddNumbersThread();

	public EvenOddDemo() {
		new Thread(this).start();
		even.printEvenNumbers(20);
	}

	public static void main(String[] args) {
		new EvenOddDemo();
	}

	@Override
	public void run() {
		odd.printOddNumbers(20);
	}

}
