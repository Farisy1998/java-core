
public class AllInOne {

	public static void main(String[] args) {
		// primitive to wrapper
		int x = 1000;
		String y = Integer.toString(x);
		
		// wrapper to primitive
		Integer b = new Integer(y);
		int z = b.intValue();
		
		// wrapper to string
		Integer c = new Integer(z);
		String s = c.toString();
		
		// string to primitive
		int i = Integer.parseInt(s);	// to convert string to any primitive
										// type, there is a parse() method.
										// like, Integer.parseInt( <value_of_int> );
	}

}
