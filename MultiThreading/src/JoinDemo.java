import java.util.Scanner;

public class JoinDemo extends Thread {

	static int n, sum = 0;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("Sum of first n numbers: ");
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		JoinDemo.n = scanner.nextInt();
		JoinDemo joinDemo = new JoinDemo();
		joinDemo.start();
		try {
			joinDemo.join();
		} catch (InterruptedException e) {
			System.out.println("Child thread exiting...");
		}

		System.out.println("Sum of first " + JoinDemo.n + " natural numbers is: " + JoinDemo.sum);
		long end = System.currentTimeMillis();
		System.out.println("Total time taken by the thread to complete is: " + (end - start) / 1000 + " seconds");
	}

	@Override
	public void run() {
		for (int i = 0; i < JoinDemo.n; i++) {
			JoinDemo.sum += i;
			System.out.println("i: " + JoinDemo.sum + "\t");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Child thread exiting...");
			}
		}
	}

}
