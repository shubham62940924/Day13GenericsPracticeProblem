package blz.demo.generics;

/* @purpose :// checking max of three Strings
  *we use compare The compareTo method returns a value that is negative, zero, 
  *or positive depending upon whether the argument is less than, equal to, or
  *greater than the given object
*/

public class TestMaximum {
	String x, y, z;

	// constructor
	public TestMaximum(String x, String y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// checking max of three Strings
	public static String testMaximum(String x, String y, String z) {
		String max = x;// Initializing x as greater
		if (y.compareTo(max) > 0)
			max = y;// as of now y is greater

		if (z.compareTo(max) > 0)
			max = z;// now z is greater
		printMax(x, y, z, max);
		return max;

	}

	public static void printMax(String x, String y, String z, String max) {
		System.out.printf("the max of %s , %s and %s is %s\n", x, y, z, max);
	}
}