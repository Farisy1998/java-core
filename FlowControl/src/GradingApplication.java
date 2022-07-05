import java.util.*;

public class GradingApplication {

	public static String generateResult(int mark) {

		if (mark < 35) {
			return "Failed";
		} else if ((35 < mark) && (mark <= 59)) {
			return "C grade";
		} else if ((60 < mark) && (mark <= 69)) {
			return "B grade";
		}

		return "A grade";
	}

	public static void main(String[] args) {
		int maths, physics, chemistry;
		Scanner s = new Scanner(System.in);
		System.out.println("Maths mark: ");
		maths = s.nextInt();
		System.out.println("Physics mark: ");
		physics = s.nextInt();
		System.out.println("Chemistry mark: ");
		chemistry = s.nextInt();
		System.out.println("Maths: " + generateResult(maths));
		System.out.println("Physics: " + generateResult(physics));
		System.out.println("Chemistry: " + generateResult(chemistry));
	}

}
