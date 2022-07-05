
public class ForLoop {

	public static void main(String[] args) {
		int n = 10;
		for (int i = n; i >=0; i--) {
			System.out.println(i);
			break;	// break pushes the execution control outside the loop,
					// once the break is executed
		}
	}

}
