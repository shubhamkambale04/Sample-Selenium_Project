package day07;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static void main(String[] args) {

		Integer[] numbers = { 10, 20, 30, 40, 50 };

		Arrays.sort(numbers, Collections.reverseOrder());
		System.out.println("After reverse:" +Arrays.toString(numbers));

		for (int i = numbers.length - 1; i >= 0; i--) {

			System.out.println(numbers[i]);
		}
	}
}
