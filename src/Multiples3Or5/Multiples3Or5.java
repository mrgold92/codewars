package Multiples3Or5;

import java.util.stream.IntStream;

public class Multiples3Or5 {

	public static void main(String[] args) {

		System.out.println(solution(10));
	}

	public static int solution(int number) {

		return IntStream.range(0, number)
				.filter(x -> x % 3 == 0 || x % 5 == 0)
				.sum();
	}
}
