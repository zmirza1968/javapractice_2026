package Day22CollectionsHashSet;

import java.util.HashSet;
import java.util.Iterator;

class Employee
{
	
	int empNo;
	String empName;
	int empSal;
	
	Employee(int empNo,String empName, int empSal)
	{
		
		this.empNo=empNo;
		this.empName=empName;
		this.empSal=empSal;
		
	}
	
}



public class HashSetWithObjects {

	public static void main(String[] args) {
		
		Employee e1= new Employee(101, "John",20000);
		Employee e2= new Employee(102, "David", 50000);
		Employee e3= new Employee(103,"Mary",70000);
		Employee e4= new Employee(104,"candy",65000);
		Employee e5= new Employee(105,"Murry",80000);
		
		HashSet<Employee> myset = new HashSet<Employee>();
		
		myset.add(e1);
		myset.add(e2);
		myset.add(e3);
		myset.add(e4);
		myset.add(e5);
		
		// read data from objects using for each loop
		
		
		/*
		for (Employee emp:myset)
		{
			System.out.println(emp.empName+ "  " +emp.empNo + "  "+emp.empSal);
		}
	
		*/
		
		Iterator itr = myset.iterator();

		while (itr.hasNext())
		{
		    Employee emp = (Employee) itr.next();

		    System.out.println(emp.empName + "  " + emp.empNo + "  " + emp.empSal);
		}
	}

}
