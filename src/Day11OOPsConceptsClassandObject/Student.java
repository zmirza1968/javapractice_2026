package Day11OOPsConceptsClassandObject;

public class Student {

	// Vaiables

	int rollNo;
	String name;
	
	// constructor
	 Student (int rno,String n)
	{
		rollNo=rno;
		name=n;
	}
	
	
	void setData(int rno,String n)
	{
		rollNo=rno;
		name=n;
	}
	

	void display() {

		System.out.println(rollNo + " " + name);

	}

}
