package blz.demo.generics;
/* @purpose :// uses generic to find maximum
  *we use compare The compareTo method returns a value that is negative, zero, 
  *or positive depending upon whether the argument is less than, equal to, or
  *greater than the given object
*/

public class TestMaximum<T extends Comparable<T>> {
	T x, y, z;

//constructor
	public TestMaximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

//checking max of three integers
	public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
		T max = x;// Initializing x as greater
		if (y.compareTo(max) > 0)
			max = y;// as of now y is greater

		if (z.compareTo(max) > 0)
			max = z;// now z is greater
		printMax(x, y, z, max);
		return max;

	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("the max of %s , %s and %s is %s\n", x, y, z, max);
	}
}
