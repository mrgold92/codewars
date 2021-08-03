package MixedSum;

import java.util.Arrays;
import java.util.List;

public class MixedSum {

	public static void main(String[] args) {

		System.out.println(sum(Arrays.asList(5,"10")));
	}

	public static int sum(List<?> mixed) {
	
		return mixed.stream().mapToInt(a -> Integer.parseInt(a.toString())).sum();
	}

}
