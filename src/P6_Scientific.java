/*
	ISYS 320
	Name(s): Anthony, Kombey, Kine 	
	Date: September 27th
*/

public class P6_Scientific {

	public static void main(String[] args) {
		// REMINDER: Any print statements should only be in the main method
		double base = 6.5;
		double exponent = 3;

		System.out.println(computeScientificValue(base, exponent));

	}

	public static double computeScientificValue(double base, double exponent) {
		double value = base * Math.pow(10, exponent);
		return value;
	}

}
