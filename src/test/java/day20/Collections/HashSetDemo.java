package day20.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		// homogenious data
		// HashSet <String> myset=new HashSet<String>();

		// hetrogenious data
		HashSet<Object> myset = new HashSet<Object>();
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add('A');
		myset.add(true);
		myset.add(100);
		myset.add(null);

		// print array list
		System.out.println(myset);

		// size
		System.out.println(myset.size());

		// remove element
		myset.remove(10.5);
		System.out.println(myset);

		// inserting element - not possible

		// Access specific element - not possible we can achieve in following way

		// convert HashSet into ArrayList
		ArrayList<Object> al = new ArrayList<Object>(myset);
		System.out.println(al);
		System.out.println(al.get(2));

		// read all the elements
		for (Object value : myset) {
			System.out.println(value);
		}

		// using Iterator
		Iterator<Object> it = myset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// remove multiple elements into array list - not possible

		// clear all elements into the array list
		// myset.clear();
		// System.out.println(myset);
		System.out.println(myset.isEmpty());
	}
}
