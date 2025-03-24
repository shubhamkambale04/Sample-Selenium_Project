package day20.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Object, Object> mymap = new HashMap<Object, Object>();

		mymap.put(101, "John");
		mymap.put(102, "Scott");
		mymap.put(103, "Marry");
		mymap.put(104, "Scott");
		mymap.put(102, "David");

		System.out.println(mymap);

		// size
		System.out.println(mymap.size());

		// remove pair
		mymap.remove(102);
		System.out.println(mymap);

		// Access specific value of key
		System.out.println(mymap.get(103));

		// gey all the keys
		System.out.println(mymap.keySet());

		// get all the values
		System.out.println(mymap.values());

		// get all the key and value
		System.out.println(mymap.entrySet());
		

		// reading data
		for (Object value : mymap.keySet()) {
			System.out.println(value + " " + mymap.get(value));
		}

		// using iterator
		Iterator<Entry<Object, Object>> it = mymap.entrySet().iterator();

		while (it.hasNext()) {
			
			Entry<Object, Object> entry = it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// clear all elements into the array list
		// mymap.clear();
		// System.out.println(myset);
		System.out.println(mymap.isEmpty());
	}

}
