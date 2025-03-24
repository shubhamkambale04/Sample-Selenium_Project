package day14.Inheritance;

class Animal {
	void display() {
		System.out.println("Parent class display method");
	}
}

class Dog extends Animal {
	@Override
	void display() { // Overriding Parent's method
		System.out.println("Child class overridden display method");
	}
}

public class OverrideExample {
	public static void main(String[] args) {
		Animal obj = new Dog(); // Runtime polymorphism
		obj.display();          //  calls overridden method in Child class
	}
}
