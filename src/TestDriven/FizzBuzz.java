package TestDriven;

public class FizzBuzz {

	public String printStringofInput(int number) {
		String output = null;
		if (number%3 != 0 && number%5 != 0) {
			output = String.valueOf(number);
		}else if(number %3 == 0) {
			output = "Fizz";
		}else if(number %5 == 0) {
			output = "Buzz";
		}
		return output;
		}
	
}
