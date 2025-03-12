package day18.HandlingExceptions;

import java.util.Scanner;

public class UncheckedExceptions {

	public static Scanner sc;
	
	public static void main(String[] args) {

		sc = new Scanner(System.in);

		// 1) Arithmetic Exception
		System.out.println("Programe is started...");

		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println(100 / num); // num value provided is 0

		System.out.println("Programe is completed...");

		// 2) Array out of bound Exception
		System.out.println("Programe is started...");

		int[] a = new int[5];  //0-4 if we enter grater than 4 value for position
		System.out.println("Enter position:");
		int pos = sc.nextInt();
		System.out.println("Enter a value:");
		int value = sc.nextInt();
		a[pos] = value;
		System.out.println(a[pos]);

		System.out.println("Programe is completed...");

		// 3) Number format Exception
		System.out.println("Programe is started...");

		String s = "12345";  // string is in alphabate
		int number = Integer.parseInt(s);
		System.out.println(number);

		System.out.println("Programe is completed...");

		// 4) Null pointer Exception
		System.out.println("Programe is started...");
		String s1="welcome"; // string is null
		int len=s1.length();
		System.out.println(len);
		
		System.out.println("Programe is completed...");
	}
}
