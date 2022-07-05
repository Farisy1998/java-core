
public class BMICalculator {

	public static void main(String[] args) {
		// BMI - Body Mass Index
		// formula:- bmi = weight in kg/(height in meters * height in meters)
		
		double height = 5.7;
		double weight = 85;
		
		double heightInMeters = height * 0.4536; // formula for converting height to meters
		double bmi = weight/ (heightInMeters * heightInMeters);
		System.out.println("My BMI is: "+bmi);
 				
	}

}
