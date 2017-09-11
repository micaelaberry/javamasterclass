
public class ForWhileInterest {

	public static void main(String[] args) {

		for (int number = 0; number < 5; number++) {
			System.out.println("loop " + number + " hello!");
		}

		for (int i = 2; i < 9; i++) {
			System.out.println("10,000 at " + i + " % interest is = " + calculateInterest(10000, i));
		}
		
		for (int i = 8; i >= 2; i--) {
			System.out.println("10,000 at " + i + " % interest is = "  + calculateInterest(10000, i));
		}
	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}
}
