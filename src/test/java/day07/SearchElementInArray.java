package day07;

public class SearchElementInArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 50, 30, 40 };
		int search_element = 20;

		boolean status = false;

		for (int i : a) {
			if (i == search_element) {
				System.out.println("Element found");
				status = true;
				break;
			}
		}
		
		if (status == false) {
			System.out.println("Element not found");
		}
	}
}
