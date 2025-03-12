package day07;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {
		//int[] s = { 1, 2, 4, 5, 3 };
		//char s[]= {'E','C','D','B','A'};
		String s[]= {"John","Scott","David","Marry"};
		
		System.out.println("Before sorting:" +Arrays.toString(s));
		
		Arrays.sort(s);  // sorting by alphabetical order
		
		System.out.println("After sorting:" +Arrays.toString(s));
		
		
		

	}

}
