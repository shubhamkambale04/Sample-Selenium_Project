package day16.DataAbstractionAndInterface;

// Hybrid inheritance by adding another class otherwisw it is multiple inheritance
public class C extends C1 implements I1, I2 {

	public void m1() {

		System.out.println(x);
	}

	public void m2() {

		System.out.println(y);
	}

	public void m3() {

		System.out.println(z);
	}

	public static void main(String[] args) {

		C c = new C();
		c.m1();
		c.m2();
		c.m3();

	}

}
