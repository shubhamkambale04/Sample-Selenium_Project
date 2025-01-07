package day15;

class Test
{
	final int x=100;
}

public class FinalKeyword {

	public static void main(String[] args) {
		Test test=new Test();
		//test.x=200; // we can not change the value 
		int v=test.x;
		System.out.println(v);

	}

}
