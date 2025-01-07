package day11.MethodandConstructor;

public class MainClass {

	public static void main(String[] args) {

		MultipleMethodsCombination mmc = new MultipleMethodsCombination();
		/*
		 * mmc.m1();
		 * 
		 * String s = mmc.m2(); System.out.println(s);
		 * 
		 * mmc.m3("Kim");
		 * 
		 * String s1 = mmc.m4("John"); System.out.println(s1);
		 */

		// Approach 1 through object reference variable

		// Student stu = new Student();

		/*
		 * stu.sid=1; stu.sname="David"; stu.grade='B';stu.printData()
		 */

		// Approach 2 using method

		/*
		 * stu.setData(2, "Tim", 'A'); stu.printData();
		 */

		// Approach 3 using constructor
		/*
		 * Student stu = new Student(3, "John", 'c'); stu.printData();
		 */

		// Invoke default constructor
		ConstructorDemo cd = new ConstructorDemo();
		cd.sum();

		// Invoke parameterized constructor
		ConstructorDemo cd1 = new ConstructorDemo(200, 300);
		cd1.sum();

	}

}
