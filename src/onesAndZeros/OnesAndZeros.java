package onesAndZeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given an array of ones and zeroes, convert the equivalent binary value to an integer.
//Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

public class OnesAndZeros {

	public static void main(String[] args) {

		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
	}

	public static int ConvertBinaryArrayToInt(List<Integer> binary) {

		return Integer.parseInt(binary.stream().map(Object::toString).collect(Collectors.joining("")), 2);
	}
}
