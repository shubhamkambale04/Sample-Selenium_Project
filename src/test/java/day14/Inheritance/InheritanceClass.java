package day14.Inheritance;

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

		A obj=new A();
		obj.a=100;
		obj.print();
		
		// single inheritance
		B obj1 = new B();
		obj1.a=100;
		obj1.b=50;
		obj1.print();
		obj1.show();

		// multi-level inheritance
		C obj2 = new C();
		obj2.a=100;
		obj2.b=50;
		obj2.c=50;
		obj2.print();
		obj2.show();
		obj2.display();
		
		
	}
}
