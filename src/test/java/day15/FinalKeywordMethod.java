package day15;

final class Test1
{
	final void m()
	{
		System.out.println("method from test1");
	}
}

class Test2 extends Test1   // incorrect because Test1 is final class
{
	void m()          // incorrect because m() is final method
	{
		System.out.println("Method from test2");
	}
}

public class FinalKeywordMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
