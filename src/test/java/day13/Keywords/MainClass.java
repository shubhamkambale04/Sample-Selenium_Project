package day13.Keywords;

public class MainClass {

		public static void main(String[] args) {

		StaticKeyword.m1(); // static method so we can access with classname directly 
		System.out.println(StaticKeyword.a);
		
		StaticKeyword sk=new StaticKeyword();
		sk.m2();
		System.out.println(sk.b);
		
		sk.m();
		
	
		Test.length();
		System.out.println(Test.s);
	}
}
