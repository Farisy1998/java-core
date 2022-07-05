
public class OddNumbers {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue; // continue will skip the current iteration
			}
			System.out.println(i);
		}
	}

}
