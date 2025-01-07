package day11.MethodandConstructor;

public class MultipleMethodsCombination {

	// No parameters & No return value
	void m1() {
		System.out.println("Hello");
	}

	// No parameters & Returns value
	String m2()
	{
		return("Hello....");
	}

	// Takes parameters & No return value
	void m3(String name)
	{
		System.out.println(name);
	}
	
	// Takes parameters & Returns value
	String m4(String name)
	{
		return "John";
	}
}
