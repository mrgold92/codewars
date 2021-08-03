package ArrayDiff;

import java.util.stream.IntStream;

public class ArrayDiff {

	public static void main(String[] args) {

		arrayDiff(new int[] { 1, 2, 2 }, new int[] { 1, 2 });
	}

	public static int[] arrayDiff(int[] a, int[] b) {

		return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(h -> h == x)).toArray();
	}
}
