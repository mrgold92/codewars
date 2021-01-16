package dryingPotatoes;

/**
 * John bought potatoes: their weight is 100 kilograms. Potatoes contain water
 * and dry matter.
 * 
 * The water content is 99 percent of the total weight. He thinks they are too
 * wet and puts them in an oven - at low temperature - for them to lose some
 * water.
 * 
 * At the output the water content is only 98%.
 * 
 * What is the total weight in kilograms (water content plus dry matter) coming
 * out of the oven?
 * 
 * He finds 50 kilograms and he thinks he made a mistake: "So much weight lost
 * for such a small change in water content!"
 * 
 * Can you help him?
 * 
 * Write function potatoes with
 * 
 * int parameter p0 - initial percent of water- int parameter w0 - initial
 * weight - int parameter p1 - final percent of water - potatoesshould return
 * the final weight coming out of the oven w1 truncated as an int.
 * 
 * Example: potatoes(99, 100, 98) --> 50
 * 
 * @author david
 *
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(potatoes(99, 100, 98));

	}

	public static int potatoes(int p0, int w0, int p1) {
		double res = (100 - p0);
		double res2 = (100 - p1);

		double res3 = (res2 * w0) / res;
		double res4 = (res3 / w0);

		double pesototal = w0 / res4;

		return (int) (pesototal);
	}

}
