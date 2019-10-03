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
	
	@Test
	void test_input_is_2_expect_output_is_2() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = fizzbuzz.printStringofInput2(2);
		assertEquals(2,input);
	}

	@Test
	void test_input_is_3_expect_output_is_Fizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringofInputFizz(3);
		assertEquals("Fizz",input);
	}
	@Test
	void test_input_is_4_expect_output_is_4() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = fizzbuzz.printStringofInput4(4);
		assertEquals(4,input);
	}
}
