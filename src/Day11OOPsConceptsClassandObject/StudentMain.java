package Day11OOPsConceptsClassandObject;

public class StudentMain {

	public static void main(String[] args) {

		// 1. Initilize data using object reference
		
		//Student stu = new Student();

		// stu1.name = "john";
		// stu1.rollNo = 12345;
		
		
		//2. Initilize data using method
		//stu.setData(101,"john");
		
		
		//3. Initialized data using constructor
		
		Student stu= new Student(101,"JOHN");
		stu.display();

	}

}
