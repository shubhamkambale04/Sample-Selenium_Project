package day11.MethodandConstructor;

public class MainClass {

	public static void main(String[] args) {

		// class constructordemo
		// Invoke default constructor
		ConstructorDemo cd = new ConstructorDemo();
		cd.sum();

		// Invoke parameterized constructor
		ConstructorDemo cd1 = new ConstructorDemo(200, 300);
		cd1.sum();

		// class MultipleMethodsCombination
		MultipleMethodsCombination mmc = new MultipleMethodsCombination();
		mmc.m1();
		String s = mmc.m2();
		System.out.println(s);
		mmc.m3("Kim");
		String s1 = mmc.m4("John");
		System.out.println(s1);

		// class student
		// Approach 1 through object reference variable
		Student stu = new Student();  // default constructor
		stu.sid = 1;
		stu.sname = "David";
		stu.grade = 'B';
		stu.printData();

		//Approach 2 using method 
		Student stu1 = new Student();    // default constructor
		stu1.setData(2, "Tim", 'A'); 
		stu1.printData();

		// Approach 3 using constructor
		Student stu2 = new Student(3, "John", 'c');   // parameterized constructor
		stu2.printData();

	}
}
