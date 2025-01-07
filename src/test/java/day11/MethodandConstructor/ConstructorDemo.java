package day11.MethodandConstructor;

public class ConstructorDemo {
	
	int a,b;
	ConstructorDemo()    // default constructor
	{
		a=100;
		b=200;
	}
	
	ConstructorDemo(int x, int y)    // parameterized constructor
	{
		this.a=x;
		this.b=y;
	}
	
	void sum()
	{
		System.out.println(a+b);
	}

}
