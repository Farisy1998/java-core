
public class MultiCatch {

	public static void main(String[] args) {
		try {
			String input = args[0];
			System.out.println("Input is: " + input);
			int output = Integer.parseInt(input);
			System.out.println("Output is: " + output);
		} catch (ArrayIndexOutOfBoundsException arre) {
			System.out.println("The array is out of it's bound");
		} catch (NumberFormatException ne) {
			System.out.println("Invalid input is provided");
		}
		System.out.println("More codes can go here");
	}

}
