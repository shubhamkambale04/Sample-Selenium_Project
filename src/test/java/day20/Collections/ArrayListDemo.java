package day20.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList <Object> mylist= new ArrayList<>();
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		
		// print array list
		System.out.println(mylist);
		
		// size of array list
		System.out.println(mylist.size());
		
		// remove particular element from array list
		mylist.remove(1);
		System.out.println(mylist);
		
		// insert element into the array list
		mylist.add(1,"java");
		System.out.println(mylist);
		
		// modify element into the array list
		mylist.set(1, "python");
		System.out.println(mylist);
		
		// access specific element from array list
		System.out.println(mylist.get(2));
		
		//reading all elements in array list
		// Approach 1 
		
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		
		// Approach 2
		for(Object values:mylist)
		{
			System.out.println(values);
		}
		
		// Approach 3
		
		Iterator <Object> it=mylist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// checking array list is empty or not
		System.out.println(mylist.isEmpty());
		
		// clear all elements into the array list
		//mylist.clear();
		//System.out.println(mylist);
		System.out.println(mylist.isEmpty());
		
		// remove multiple elements into array list
		ArrayList <Object> mylist2=new ArrayList<>();
		mylist2.add(10.5);
		mylist2.add(null);
		mylist2.add(100);
		
		mylist.removeAll(mylist2);
		System.out.println(mylist);
		
		
		

	}

}
