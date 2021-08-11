package validParentheses;

/**
 * Write a function that takes a string of parentheses, and determines if the
 * order of the parentheses is valid. The function should return true if the
 * string is valid, and false if it's invalid.
 * 
 * @author David
 */

public class ValidParentheses {

  public static void main(String[] args) {
    System.out.println(validParentheses("()"));
  }

  public static boolean validParentheses(String parens) {
    String[] parentesis = parens.split("");
    int c = 0;

    for (int i = 0; i < parentesis.length; i++) {
      if (parentesis[i].equals("(")) c++;

      if (parentesis[i].equals(")")) c--;

      if (c < 0) return false;

    }

    return (c == 0) ? true : false;
  }

}
