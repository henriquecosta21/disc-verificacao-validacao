import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void shouldAddTwoNumbers() {
		assertEquals(50, Calculator.add(20, 30));
	}
	
	@Test
	public void shouldAddNegativeNumber() {
		assertEquals(-7, Calculator.add(7, -14));
	}
	
	@Test
	public void shouldReturnZero() {
		assertEquals(0, Calculator.add(0, 0));
	}
	
	@Test
	public void shouldCalculateTwoNegativeNumbers() {
		assertEquals(-15, Calculator.add(-5, -10));
	}

}
