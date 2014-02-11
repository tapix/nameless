package fi.metropolia.java7features;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HexLiteralsTest {

	private HexLiterals literals;

	@Before
	public void setup() {
		literals = new HexLiterals();
	}

	@Test
	public void hexEight() {
		assertEquals(literals.getHexEight(), 8);
	}

	@Test
	public void hexHundred() {
		assertEquals(literals.getHexHundred(), 100);
	}

}
