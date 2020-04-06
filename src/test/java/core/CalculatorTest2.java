package core;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTest2 {
	@Test(timeout = 1000) // @Ignore
	public void test_01_add_2() {
		System.out.println("Test # 01: Add 2 params");
		assertEquals("Not correct", Calculator.add(250.0, 63.0), 314.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_02_add_3() {
		System.out.println("Test # 02: Add 3 params");
		assertEquals("Not correct", Calculator.add(12.0, 43.0, 9.0), 64.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_03_add_4() {
		System.out.println("Test # 03: Add 4 params");
		assertEquals("Not correct", Calculator.add(15.7, 23.0, 4.9, 4.0), 47.7, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_04_divide_2() {
		System.out.println("Test # 04: Divide 2 params");
		assertEquals("Not correct", Calculator.divide(48.0, 2.0), 4.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_05_divide_3() {
		System.out.println("Test # 05: Divide 3 params");
		assertEquals("Not correct", Calculator.divide(56.0, 3.0, 7.0), 2.6, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_06_divide_4() {
		System.out.println("Test # 06: Divide 4 params");
		assertEquals("Not correct", Calculator.divide(360.0, 200.0, 32.0, 2.0), 0.2, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_07_multiply_2() {
		System.out.println("Test # 07: Multiply 2 params");
		assertEquals("Not correct", Calculator.multiply(3.0, 15.0), 45.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_08_multiply_3() {
		System.out.println("Test # 08: Multiply 3 params");
		assertEquals("Not correct", Calculator.multiply(45.0, 8.0, 19.0), 6840.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_09_multiply_4() {
		System.out.println("Test # 09: Multiply 4 params");
		assertEquals("Not correct", Calculator.multiply(2.0, 41.0, 17.0, 3.0), 4182.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_10_subtract_2() {
		System.out.println("Test # 10: Subtract 2 params");
		assertEquals("Not correct", Calculator.subtract(35.0, 2.0), 33.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_11_subtract_3() {
		System.out.println("Test # 11: Subtract 3 params");
		assertEquals("Not correct", Calculator.subtract(530.0, 26.0, 222.0), 282.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_12_subtract_4() {
		System.out.println("Test # 12: Subtract 4 params");
		assertEquals("Not correct", Calculator.subtract(742.0, 129.0, 59.0, 126.0), 428.0, 0.09);
	}
}