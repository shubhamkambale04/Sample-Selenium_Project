package day13.Keywords;

public class StaticKeyword {
	
	static int a=10;
	int b=20;

	static void m1()
	{
		System.out.println("This is static method");
	}
	
	void m2()
	{
		System.out.println("This is non static method");
	}
	
	void m()
	{
		// non static method access static or non static stuff directly
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		
		// static method so we can access directly
		m1();    
		System.out.println(a);
		
		// Non static methods
		StaticKeyword sk=new StaticKeyword();
		sk.m2();
		System.out.println(sk.b);
		sk.m();
	}
	
	

}
