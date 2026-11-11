package Day12JavaMethodandConstructor;

public class Person {
	
	// instance varaiable
	String personName;
	int personAge;
	
	/*
	Person() // default constructor not taking any parameter and also constructor should start with class name
	{
		personName="john";
		personAge=30;
	}
	*/
	
	
	Person(String name,int age) // parameterized constructor --local variables
	{
		personName=name;
		personAge=age;
	}
		
			
	
	void display() {
		System.out.println(personName + "  "+personAge);
	}
	
	
	public static void main(String[] args) 
	{
		//Person p = new Person();
		Person p = new Person("john ",30);
		p.display();
	}

}
