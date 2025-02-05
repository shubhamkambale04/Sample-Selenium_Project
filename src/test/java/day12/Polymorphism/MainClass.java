package day12.Polymorphism;

public class MainClass {

public static void main(String[] args) {
	
	Adder ad=new Adder();
	ad.sum();
	ad.sum(20, 30);
	ad.sum(30, 40.5);
	ad.sum(30, 50.5);

	// 1
	ConstructorOverloading co=new ConstructorOverloading();
	double v=co.volume();
	System.out.println(v);
	
	// 2
	ConstructorOverloading co1=new ConstructorOverloading(10.5,12.5,5.5);
	double v1=co1.volume();
	System.out.println(v1);
	
	// 3
	ConstructorOverloading co2=new ConstructorOverloading(10.5);
	double v2=co2.volume();
	System.out.println(v2);
	}
}

