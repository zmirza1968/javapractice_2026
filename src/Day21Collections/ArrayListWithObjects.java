package Day21Collections;

import java.util.ArrayList;
import java.util.Iterator;

class Student
{
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age)
    {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}




public class ArrayListWithObjects {

	public static void main(String[] args) {
	
		Student stu1 = new Student(101,"Scott",20);
		Student stu2 = new Student(102,"john",25);
		Student stu3 = new Student(103,"smith",30);
		
		ArrayList <Student>mylist = new ArrayList<Student>();
		
		mylist.add(stu1);
		mylist.add(stu2);
		mylist.add(stu3);
		
		/*
		
		Iterator itr=mylist.iterator();
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println(st.rollno+ "  "+st.name+ "  "+st.age);
			
			
		}
		*/
		
		// Read object data using for each loop
		
		for(Student list:mylist)
		{
			System.out.println(list.age + " "+list.name + " "+list.rollno);
		}
		
		}
			
				
		
	}


