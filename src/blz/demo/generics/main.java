package blz.demo.generics;

public class main {

	public static void main(String[] args) {
		System.out.println("Welcome to check max of three variables");
		String x = "kai", y = "po", z = "che", m = "bro";
		Integer a = 30, b = 39, c = 24;
		Float p = 1.9f, q = 2.8f, r = 0.2f;
		TestMaximum.<String>testMaximum(x, y, z, m);
		TestMaximum.<Integer>testMaximum(a, b, c);
		TestMaximum.<Float>testMaximum(p, q, r);
	}
}