
public class PrimitiveAndString {

	public static void main(String[] args) {
		byte x = 100;
		String str = Byte.toString(x);
		byte b = Byte.parseByte(str);
		System.out.println(b);
	}

}
