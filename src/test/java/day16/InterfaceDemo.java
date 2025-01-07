package day16;

interface Shape {
	int length = 10; // final and static variable
	int width = 20;

// 3 methods are allowed:- Abstract methods, default methods and static methods

	void circle(); // abstract method

	default void square() {
		System.out.println("This is square:- default method");
	}

	static void rectangle() {
		System.out.println("This is rectangle:- static method");
	}

}

public class InterfaceDemo implements Shape {

	int x, y;

	public void circle() {
		System.out.println("This is circle:- abstract method");
	}

	void triangle() {
		System.out.println("This is triangle");
	}

	public static void main(String[] args) {

		// Scenario 1
		InterfaceDemo id = new InterfaceDemo();
		id.circle();
		id.square();
		Shape.rectangle(); // static method can directly access from interface
		id.triangle();
		id.x = 100;
		id.y = 200;

		// Scenario 2
		Shape id1 = new InterfaceDemo();
		id1.circle();
		id1.square();
		Shape.rectangle();
		int l = Shape.length;
		int w = Shape.width;
		System.out.println(l * w);

	}

}
