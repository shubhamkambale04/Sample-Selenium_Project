package day15.FinalSuperKeywordAndMethodOverriding;

class Test
{
	final int x=100;
	void printData() {
		System.out.println(x);
	}
}

class Test1 extends Test{
	final void print() {
		System.out.println("method from test1");
	}
}

final class Test2 extends Test1 
{
	void show() {
		System.out.println("Method from test2");
	}
	
	/*
	void print()                      // extends Test1 incorrect because print() is final method
	{
		System.out.println("Method from test1");
	}
	*/
	
}

class Test3 extends Test1           // extends Test2 incorrect because Test2 is final class
{
	void display()                      
	{
		System.out.println("Method from test3");
	}
	
	/*
	void print()                      // extends Test1 incorrect because print() is final method
	{
		System.out.println("Method from test1");
	}
	*/
}

public class FinalKeywordMethod {
	
	public static void main(String[] args) {
		
		Test test=new Test();
		test.printData();
		//test.x=200;                 // In class Test x declared as final
		
		System.out.println();
		Test1 test1=new Test1();
		test1.print();
		
		System.out.println();
		Test2 test2=new Test2();
		test2.show();
		//test2.print();              // extends from Test1
		
		System.out.println();
		Test3 test3=new Test3();
		test3.display();
		//test3.print();             // extends from Test1
	}
}
