package blz.demo.generics;

/* @purpose :// checking max of three Floats
  *we use compare The compareTo method returns a value that is negative, zero, 
  *or positive depending upon whether the argument is less than, equal to, or
  *greater than the given object
*/
public class TestMaximum {
	int x, y, z;

	// constructor
	public TestMaximum(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// checking max of three float
	public static Float testMaximum(Float x, Float y, Float z) {
		Float max = x;// initialising x as greater
		if (y.compareTo(max) > 0)
			max = y;// as of now y is greater

		if (z.compareTo(max) > 0)
			max = z;// now z is greater
		printMax(x, y, z, max);
		return max;

	}

	public static void printMax(Float x, Float y, Float z, Float max) {
		System.out.printf("the max of %s , %s and %s is %s\n", x, y, z, max);
	}
}