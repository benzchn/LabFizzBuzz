package TestDriven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCaseForFIZZBUZZ {
	
	@Test
	void test_input_is_1_expect_output_is_1() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringofInput(1);
		assertEquals("1",input);
	}
	
	@Test
	void test_input_is_2_expect_output_is_2() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringofInput(2);
		assertEquals("2",input);
	}

	@Test
	void test_input_is_3_expect_output_is_Fizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringofInput(3);
		assertEquals("Fizz",input);
	}
	@Test
	void test_input_is_4_expect_output_is_4() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringofInput(4);
		assertEquals("4",input);
	}
	
	@Test
	void test_input_is_5_expect_output_is_Buzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringofInput(5);
		assertEquals("Buzz",input);
	}
	
	@Test
	void test_input_is_6_expect_output_is_Fizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringofInput(6);
		assertEquals("Fizz",input);
	}
	
	@Test
	void test_input_is_7_expect_output_is_7() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringofInput(7);
		assertEquals("7",input);
	}
	
	@Test
	void test_input_is_8_expect_output_is_8() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringofInput(8);
		assertEquals("8",input);
	}
	
	@Test
	void test_input_is_9_expect_output_is_Fizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = fizzbuzz.printStringofInput(9);
		assertEquals("Fizz",input);
	}
}
