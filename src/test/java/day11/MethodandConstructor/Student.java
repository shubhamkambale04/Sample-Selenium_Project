package day11.MethodandConstructor;

public class Student {

	// class variables throughout the class
	int sid;
	String sname;
	char grade;

	// Default constructor (needed to allow new Student();)
	public Student() {
	}

	// local or method specific variables
	void setData(int id, String name, char gr) {
		sid = id;
		sname = name;
		grade = gr;

	}

	public Student(int id, String name, char gr) {
		this.sid = id;
		this.sname = name;
		this.grade = gr;
	}

	void printData() {
		System.out.println(sid + " " + sname + " " + grade);
	}
}
