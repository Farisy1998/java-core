
public class StringParser {

	public static void main(String[] args) {
		String str = "abcd";
		try {
			int i = Integer.parseInt(str);
			System.out.println(i);
		}
		catch(NumberFormatException afe) {
			System.out.println("The String "+str+" cannot be parsed to Integer type");
		}
		
	}

}
