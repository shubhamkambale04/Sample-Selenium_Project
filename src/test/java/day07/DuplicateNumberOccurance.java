package day07;

public class DuplicateNumberOccurance {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 2, 5, 1, 2 };
		int num = 2;
		int count = 0;

		for (int value : numbers) {
			if (value == num) {
				count++;
			}
		}

		System.out.println(count);
	}
}
