package day14.Inheritance;

class A {
	
	int a;
	void print() {
		System.out.println(a);
	}
}

// Single inheritance
class B extends A {
	void print(int b) {
		System.out.println(b);
	}
}

// Multi-level inheritance
class C extends B {
	void display(int c) {
		System.out.println(c);
	}
}

public class InheritanceClass {

	public static void main(String[] args) {

		int b=100;
		A obj=new A();
		obj.a=50;
		obj.print();
		
		System.out.println();
		
		// single inheritance
		B obj1 = new B();
		obj1.a=50;
		obj1.print();
		obj1.print(b);

		System.out.println();
		
		// multi-level inheritance
		C obj2 = new C();
		obj2.a=50;
		obj2.print();
		obj2.print(b);
		obj2.display(200);
		
		
	}
}
