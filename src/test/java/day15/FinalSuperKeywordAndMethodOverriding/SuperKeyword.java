package day15.FinalSuperKeywordAndMethodOverriding;

class ABC {
	int x = 100;

	void display() {
		System.out.println(x);
	}

	void print() {
		System.out.println("class ABC");
	}
}

class PQR extends ABC {
	int x = 200;

	void show() {
		System.out.println(x);
	}

	void print() {
		System.out.println("class PQR");
		super.print();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {

		ABC s = new ABC();
		s.display();
		s.print();

		System.out.println();
		PQR s1 = new PQR();
		s1.show();
		s1.print();
		s1.display();

	}

}
