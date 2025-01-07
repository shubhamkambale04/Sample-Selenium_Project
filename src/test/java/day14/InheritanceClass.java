package day14;

class A {
	int a;

	void print() {
		System.out.println(a);
	}
}

// Single inheritance
class B extends A {
	int b;

	void show() {
		System.out.println(b);
	}
}

// Multi-level inheritance
class C extends B {
	int c;

	void display() {
		System.out.println(c);
	}
}

public class InheritanceClass {

	public static void main(String[] args) {

		// single inheritance
		B obj = new B();
		obj.a=100;
		obj.b=50;
		obj.print();
		obj.show();

		// multi-level inheritance
		C obj1 = new C();
		obj1.a=100;
		obj1.b=50;
		obj1.c=50;
		obj1.print();
		obj1.show();
		obj1.display();
	}
}
