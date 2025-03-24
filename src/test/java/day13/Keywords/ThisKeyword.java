package day13.Keywords;

public class ThisKeyword {

	int x, y;

	// Prameterised constructor
	public ThisKeyword(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// default constructor
	public ThisKeyword() {

	}

	void setData(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void print() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {

		ThisKeyword th = new ThisKeyword(100, 200);
		th.print();

		ThisKeyword th1 = new ThisKeyword();
		th1.setData(100, 200);
		th1.print();

	}

}
