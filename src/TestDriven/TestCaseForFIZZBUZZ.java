package TestDriven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCaseForFIZZBUZZ {

	@Test
	void test_input_is_1_expect_output_is_1() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = fizzbuzz.printStringofInput(1);
		assertEquals(1,input);
	}

	
}
