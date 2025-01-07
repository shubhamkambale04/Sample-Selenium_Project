package day04;

public class LargestNUmber {

	public static void main(String[] args) {

		int a = 10, b = 20, c = 30;

		if (a > b && a > c) {
			System.out.println("largect number:" + a);
		} else if (b > a && b > c) {
			System.out.println("largect number:" + b);
		} else {
			System.out.println("largect number is c:"+c);
		}

	}

}
