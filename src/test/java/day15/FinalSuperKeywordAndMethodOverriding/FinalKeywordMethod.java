package day15.FinalSuperKeywordAndMethodOverriding;

class Test1 {
	void m() {
		System.out.println("method from test1");
	}
}

class Test2 extends Test1 // incorrect because Test1 is final class
{
	void m() // incorrect because m() is final method
	{
		System.out.println("Method from test2");
	}
}

public class FinalKeywordMethod {

	public static void main(String[] args) {
		Test1 test=new Test1();
		test.m();
		
		Test2 test1=new Test2();
		test1.m();
		test1.m();

	}

}
