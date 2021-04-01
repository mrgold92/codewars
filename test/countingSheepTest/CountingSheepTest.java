package countingSheepTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import countingSheep.Main;

public class CountingSheepTest {

	Boolean[] array1 = { true, true, true, false, true, true, true, true, true, false, true, false, true, false, false,
			true, true, true, true, true, null, false, true, true };

	@Test
	public void test1() {
		assertEquals(17, new Main().countSheeps(array1));
	}

}
