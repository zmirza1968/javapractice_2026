package Day11OOPsConceptsClassandObject;

public class Employee {
	
	
	// variables
	String name;
	int id;
	double salary;
	
	
	
	void display() {
		System.out.println(name+ " "+id+ " salary");
	}
	
	void getsalary() {
		System.out.println("Salary of the employee "+salary);
	}
	
	
	

	public static void main(String[] args) {
	
		
		Employee emp1 = new Employee();
		emp1.name="john";
		emp1.id=101;
		emp1.salary=50000;
		
		emp1.display();
		emp1.getsalary();
		
		
		Employee emp2 = new Employee();
		emp2.name="scott";
		emp2.id=102;
		emp2.salary=60000;
		
		emp2.display();
		emp2.getsalary();
	}

}
