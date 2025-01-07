package day0;

public class FindSumOfDigitsInNumber {

	public static void main(String[] args) {
		int number = 423424; // Example number
		int sum = 0;

		while (number != 0) {
			int digit = number % 10; // Extract the last digit
			sum += digit; // Add the digit to the sum
			number = number / 10; // Remove the last digit
		}

		System.out.println("Sum of digits: " + sum);
	}
}