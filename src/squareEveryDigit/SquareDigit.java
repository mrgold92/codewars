package squareEveryDigit;

public class SquareDigit {

	private static String resultado = "";

	public static int squareDigits(int n) {
		resultado="";
		String a = String.valueOf(n);

		a.chars().forEach(c -> {

			int b = Integer.parseInt(String.valueOf((char) c));

			resultado += String.valueOf(b * b);
		});
		

		return Integer.parseInt(resultado);
	}

}
