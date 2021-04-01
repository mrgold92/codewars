package squareEveryDigitTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import squareEveryDigit.SquareDigit;

public class SquareEveryDigitTest {

	@Test
	public void test() {

		assertEquals(811181, SquareDigit.squareDigits(9119));
		assertEquals(0, SquareDigit.squareDigits(0));
	}

}
