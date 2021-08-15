package numberOfTrailingZerosOfN;

/**
 * Write a program that will calculate the number of trailing zeros in a
 * factorial of a given number. N! = 1 * 2 * 3 * ... * N 
 * Be careful 1000! has 2568 digits...
 */

public class NumberOfTrailingZeros {

  public static void main(String[] args) {

    System.out.println(zeros(14));

  }

  public static int zeros(int n) {

    int zeros = 0;

    while (n != 0) {
      zeros += (int) Math.floor(n / 5);
      n /= 5;
    }

    return zeros;
  }
}
