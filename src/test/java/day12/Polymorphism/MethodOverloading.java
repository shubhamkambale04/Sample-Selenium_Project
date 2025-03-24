package day12.Polymorphism;

public class MethodOverloading {
	
	void print() {
		System.out.println("value: "+"No parameters");
	}
	
	void print(int a) {
		System.out.println("value: "+a);
	}
	
	void print(int a, int b) {
		System.out.println("value: "+(a+b));
	}
	
	void print(int a,String name) {
		System.out.println("value: "+a+" "+name);
	}

	public static void main(String[] args) {
		
		int a=10,b=20;
		String name="john";
		
		MethodOverloading mo=new MethodOverloading();
		mo.print();
		mo.print(a);
		mo.print(a, b);
		mo.print(a, name);
		
		

	}

}
