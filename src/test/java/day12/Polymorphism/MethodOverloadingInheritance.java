package day12.Polymorphism;

class Parent {
	void show() {
		System.out.println("Parent class: show() without parameters");
	}

	void show(String msg) {
		System.out.println("Parent class: show() with String parameter: " + msg);
	}
}

class Child extends Parent {
	// Overloading show() method from Parent
	void show(int num) { 
		System.out.println("Child class: show() with int parameter: " + num);
	}
}

public class MethodOverloadingInheritance {
	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.show(); // Calls Parent class method
		obj.show("Hello"); // Calls Parent class overloaded method
		obj.show(10); // Calls Child class overloaded method
	}
}
