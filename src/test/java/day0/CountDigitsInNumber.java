package day0;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		int i=423424;
		int count = 0;

		while (i != 0) {
            i = i / 10; // Remove the last digit
            count++; // Increment the count for each digit
		}
		System.out.println(count);
	}
}
