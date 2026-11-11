package Day21Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		

		
		//ArrayList myList = new ArrayList(); // Generic		
		//List myList = new ArrayList();  // Generic		
		//ArrayList<String> myList= new ArrayList<String>();
		
		List myList = new ArrayList();  // Generic	
		
		// Adding various types data
		
		myList.add(100); // Integer
		myList.add(10.5); // Double
		myList.add("Welcome"); // String
		myList.add('A'); // Character
		myList.add(true); // Boolean
		myList.add(100); // Integer
		myList.add(null);
		myList.add(null);
		
		
		System.out.println("Size of array list "+myList.size());
		
		System.out.println("ArrayList elements "+myList);// [100, 10.5, Welcome, A, true, 100, null, null]
		
		// Remove an element
		myList.remove(5);
		System.out.println("ArrayList elements "+myList);//[100, 10.5, Welcome, A, true, null, null]
		
		
		myList.add(2,"java");
		System.out.println("After inserting ArrayList elements "+myList);//[100, 10.5, java, Welcome, A, true, null, null]
		
		myList.set(2, "Python");
		System.out.println("After modification ArrayList elements "+myList);
		
		// access specific element
		
		System.out.println("Element at index 3 :"+myList.get(3));
		
		// 1 read elements using normal for loop
		System.out.println("Getting using normal for loop....");
		/*
		for(int i=0;i<myList.size()-1;i++) 
		{
			System.out.println(myList.get(i));
		}
		*/
		
		// read elemetn using for each loop
		/*
		System.out.println("Getting using normal for loop....");
		
		for(Object element:myList)
		{
			System.out.println(element);
		}
		*/
		
		// Read element using Iterator
		
		Iterator iterate=myList.iterator();
		while (iterate.hasNext()) 
		{
			System.out.println(iterate.next());
		}
		
		// removing group of elements 
		
		ArrayList myList2 = new ArrayList();
		myList2.add(100);
		myList2.add("Welcome");
		
		myList.removeAll(myList2);
		System.out.println("After removing gropu of elements : "+myList);
		
		// CLEAR all the elements
		myList.clear();
		System.out.println("After clearing data from list :"+myList);
		
	}

}











