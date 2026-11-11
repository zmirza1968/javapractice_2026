package Day16OverridingVsOverloading;

class Employee {
	String empname;

    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
	
	int deptno;
    @Override
    double calculateSalary() {
        return 50000;
    }
}

class PartTimeEmployee extends Employee {

    @Override
    double calculateSalary() {
        return 20000;
    }
}

public class MethodOverRidingDemo {

    public static void main(String[] args) {
    	
    	/*
        FullTimeEmployee fte = new FullTimeEmployee();
        System.out.println("Salary of Full-time Employee: "
                + fte.calculateSalary());

        PartTimeEmployee pte = new PartTimeEmployee();
        System.out.println("Salary of Part-time Employee: "
                + pte.calculateSalary());
        */
    	
        // Run time polymorphism
       
        Employee emp = new FullTimeEmployee();
        emp.empname ="john"; // valid 
        // emp.deptno=101; not possible 
       System.out.println("Employee salary :"+ emp.calculateSalary());  // called from fulltimeEmplyee (child class)
       
       Employee emp1 = new PartTimeEmployee();
       System.out.println("Employee salary :"+ emp1.calculateSalary());
       
    }
}