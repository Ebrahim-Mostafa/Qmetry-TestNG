package com.qmetry.testng_demo;

import com.qmetry.BaseTest;
import com.qmetry.Calculator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class CalculatorTest extends BaseTest {
	private static Calculator calculator;

	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}

	@Test
	public void testSum() {
		int result = calculator.sum(3, 4);

		assertEquals(7, result);
	}

	@Test
	public void testDivison() {
		try {
			int result = calculator.divison(10, 2);

			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expectedExceptions = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.divison(10, 0);
	}

	@Test
	public void testEqual() {
		boolean result = calculator.equalIntegers(20, 20);
		assertTrue(result);
	}

	@Test
	public void testSubstraction() {
		int result = 10 - 3;

		assertTrue(result == 7);
	}
}
