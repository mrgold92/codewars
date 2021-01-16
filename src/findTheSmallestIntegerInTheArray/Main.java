package findTheSmallestIntegerInTheArray;

/**
 * Given an array of integers your solution should find the smallest integer.
 * 
 * For example:
 * 
 * Given [34, 15, 88, 2] your solution will return 2 Given [34, -345, -1, 100]
 * your solution will return -345 You can assume, for the purpose of this kata,
 * that the supplied array will not be empty.
 * 
 * @author david
 *
 */
public class Main {

	public static void main(String[] args) {
		
		System.out.println(findSmallestInt(new int[]{34, 15, 88, 2}));

	}

	public static int findSmallestInt(int[] valores) {

		int min = valores[0];

		for (int valor : valores) {
			if (valor < min) {
				min = valor;
			}
		}

		return min;
	}

}
