package kata4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		System.out.println(findUniq(new double[] {1, 1, 1, 2, 1, 1,5,3,5,6,7,3}));
	}

	public static double findUniq(double arr[]) {

		Arrays.sort(arr);
		
		if (arr[0] == arr[1]) {
			return arr[arr.length - 1];
		}
		return arr[0];

	}
}
