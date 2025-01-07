package day10.ClassObject;

public class MainClass {

public static void main(String[] args) {
		
		Employee emp1=new Employee();   // Object
		emp1.emp_id=101;
		emp1.emp_name="Shubham";
		emp1.emp_desg="Test Engineer";
		emp1.emp_sal=50000;
		emp1.display();
		
		Employee emp2=new Employee();   // Object
		emp2.emp_id=102;
		emp2.emp_name="Suraj";
		emp2.emp_desg="Developer";
		emp2.emp_sal=60000;
		emp2.display();
		
	}

}
