/*
	ISYS 320

	Name(s): Anthony, Kombey, Kine
	Date: September 27th 
*/

/*
 What were the errors you found?
 
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = ftoc(tempf, 0);
		System.out.println("Body temp in C is: " + tempc);
	}

	// converts Fahrenheit temperatures to Celsius
	public static double ftoc(double tempf, double tempc) {
		tempc = (tempf - 32) * 5 / 9;
		return tempc;
	}
}
