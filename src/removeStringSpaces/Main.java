package removeStringSpaces;

/**
 * Simple, remove the spaces from the string, then return the resultant string.
 * 
 * @author david
 *
 */
public class Main {

	public static void main(String[] args) {

		String spacesTrim = noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd");
		System.out.println(spacesTrim);
	}

	public static String noSpace(final String x) {
		return x.replaceAll("\\s+", "");
	}

}
