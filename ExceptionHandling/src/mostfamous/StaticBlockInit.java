package mostfamous;

public class StaticBlockInit {

	static {
		int i = 20/0;	// ArithmeticException will raise
	}
	public static void main(String[] args) {

	}

}
