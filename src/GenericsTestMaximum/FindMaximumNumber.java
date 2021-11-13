package GenericsTestMaximum;
import java.lang.String;
import org.junit.Test;

public class FindMaximumNumber {
	public static <E extends Comparable<E>> E maximum(E a, E b, E c) {
		E max = a;

		if (b.compareTo(max) > 0)
			max = b;

		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	@Test
	public static void main(String[] args) {
		System.out.println("Maximum number is " + maximum(32, 26, 11));
		System.out.println("Maximum number is " + maximum(13, 47, 29));
		System.out.println("Maximum number is " + maximum(21, 48, 58));

	}
}