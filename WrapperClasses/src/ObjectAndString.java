
public class ObjectAndString {

	public static void main(String[] args) {
		long x = 1000;
		Long y = Long.valueOf(x);
		String str = y.toString();
		Long z = Long.valueOf(str);
	}

}
