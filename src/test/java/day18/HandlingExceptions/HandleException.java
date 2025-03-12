package day18.HandlingExceptions;

import java.util.Scanner;

public class HandleException {

	public static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		// 1) Arithmetic Exception
		System.out.println("Programe is started...");

		System.out.println("Enter a number:");
		try {
			int num = sc.nextInt();
			System.out.println(100 / num);
		} catch (Exception e) {
			System.out.println("Invalid data");
			System.out.println(e);
		}
		System.out.println("Programe is completed...");
	}
}
