
public class SingleThreading {

	public static void main(String[] args) {
		SingleThreading st = new SingleThreading();
		st.printNumber();
		System.out.println("");
		for (int j = 1; j <= 200; j++) {
			System.out.print("j: " + j + "\t");
		}
	}

	void printNumber() {
		for (int i = 1; i <= 200; i++) {
			System.out.print("i: " + i + "\t");
		}
	}

}
