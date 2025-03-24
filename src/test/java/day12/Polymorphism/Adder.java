package day12.Polymorphism;

public class Adder {
	
	int a=10, b=20;
	
	void sum()                                 // 1
	{
		System.out.println(a+b);
	}

	void sum(int x, int y)                     // 2 Change the Number of Parameters
	{
		System.out.println(x+y);
	}
	
	void sum(int x, double y)                  // 3 Change the Data Type of Parameters
	{
		System.out.println(x+y);
	}
	
	void sum(double y, int x)                  // 4 Change the Order of Parameters
	{
		System.out.println(x+b);
	}
}
