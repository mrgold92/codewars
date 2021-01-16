package countTheDivisibleNumbers;

/**
 * Complete the function that takes 3 numbers x, y and k (where x ≤ y), and
 * returns the number of integers within the range [x..y] (both ends included)
 * that are divisible by k.
 * 
 * More scientifically: { i : x ≤ i ≤ y, i mod k = 0 }
 * 
 * @author david
 *
 */
public class Main {

	public static void main(String[] args) {

		System.out.println(divisibleCount(6, 11, 2));
	}

	public static long divisibleCount(long x, long y, long k) {

		return Math.floorDiv(y, k) - Math.floorDiv(x - 1, k);

	}

}
