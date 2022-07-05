
public class BitwiseOperators {

	public static void main(String[] args) {
		System.out.println(true & true);
		System.out.println(false | false);
		System.out.println(false ^ true); // XOR will return true if both of the
										  // arguments are different, else return false
		System.out.println(4 & 5); // calculated in bitwise
								   //
								   // 100 &
								   // 101
								   // -----
								   // 100
		System.out.println(4 | 5);
		System.out.println(4^5);
		
		// Complement operator (~)
		// --------------------------------------
		// the compliment bit of 1001 is 0110
		
		
		// Boolean complement (!)
		// -----------------------------------------
		// the inversion or NOT of true is false
	}

}
