package assertions;

public class AssertDemo {

	public static void main(String[] args) {
		int withdrawAmount = 1100;
		int currentBalance = 200;
		
		assert(withdrawAmount<currentBalance):"Withdraw amount is more than current balance";
	}

}
