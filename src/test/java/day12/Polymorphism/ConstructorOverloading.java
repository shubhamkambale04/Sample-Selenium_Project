package day12.Polymorphism;

public class ConstructorOverloading {

	double width, height, depth;

	// 1
	ConstructorOverloading() {
		width = 0;
		height = 0;
		depth = 0;

		// width = height = depth = 0;
	}

	// 2
	ConstructorOverloading(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// 3
	ConstructorOverloading(double len) {
		width = height = depth = len;
	}

	double volume() {
		double d = width * height * depth;
		return d;
	}
}
