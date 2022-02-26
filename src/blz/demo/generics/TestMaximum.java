package blz.demo.generics;

/* @purpose :// checking max of three integers
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

	// checking maximum of three integers
	public static Integer testMaximum(Integer x, Integer y, Integer z) {
		Integer max = x;// Initializing x as greater
		if (y.compareTo(max) > 0)
			max = y;// y is greater

		if (z.compareTo(max) > 0)
			max = z;// z is greater
		printMax(x, y, z, max);
		return max;

	}

	public static void printMax(Integer x, Integer y, Integer z, Integer max) {
		System.out.printf("the max of %s , %s and %s is %s\n", x, y, z, max);
	}
}
