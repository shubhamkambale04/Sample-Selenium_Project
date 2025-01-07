package day13;

public class ThisKeyword {

	int x, y;

	/*
	 * public ThisKeyword(int x, int y) { 
	 * this.x = x; 
	 * this.y = y; 
	 * }
	 */

	void setData(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void print() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {

		/*
		 * ThisKeyword th = new ThisKeyword(100, 200); 
		 * th.print();
		 */

		ThisKeyword th = new ThisKeyword();
		th.setData(100, 200);
		th.print();

	}

}
