package findTheUniqueNumber;

import java.util.Arrays;

/**
 * There is an array with some numbers. All numbers are equal except for one.
 * Try to find it!
 * 
 * Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2 Kata.findUniq(new
 * double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
 * 
 * @author david
 *
 */
public class Main {

	public static void main(String[] args) {

		System.out.println(findUniq(new double[] { 1, 1, 1, 2, 1, 1, 5, 3, 5, 6, 7, 3 }));
	}

	public static double findUniq(double arr[]) {

		Arrays.sort(arr);

		if (arr[0] == arr[1]) {
			return arr[arr.length - 1];
		}
		return arr[0];

	}
}
