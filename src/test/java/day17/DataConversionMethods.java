package day17;

public class DataConversionMethods {

	public static void main(String[] args) {

		//Scenario 1
		// string---->int
		// String s="welcome"; // cannot convert to int
		String s = "1234";
		int sint = Integer.parseInt(s);
		System.out.println(sint);

		String s1 = "10";
		String s2 = "20";
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));

		// String--->double
		String s3 = "10.0";
		String s4 = "20.5";
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		// String--->boolean
		String s5="false";
		System.out.println(Boolean.parseBoolean(s5));
		
		// String--->char
		//not possible because char is single character and string is combination of characters

		//Scenario 2
		//int--->String
		int a=10;
		System.out.println(String.valueOf(a));
		
		//double--->String
		double d=10.5;
		System.out.println(String.valueOf(d));
		
		//boolean--->String
		boolean b=true;
		System.out.println(String.valueOf(b));
		
		//char--->String
		char c='A';
		System.out.println(String.valueOf(c));	
	}
}
