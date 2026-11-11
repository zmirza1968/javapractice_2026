package Day22CollectionsHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		/*
		   HashSet
		1. HashSet is implemented Set interface.
		2. We can store Heterogeneous and Homogeneous Data.
		3. Duplicate Elements Not Allowed
		4. Insertion Order Not Preserved
		5. Indexing is not supported
		6. Only one Null is allowed.
		7. Insert element is not possible
		*/
		
		//Set myset = new HashSet();  //generic		
		//Set <String> myset= new HashSet<String>(); // specif
		
		// Adding elements
		
		HashSet myset = new HashSet();
		myset.add(100);  // Integer
		myset.add(10.5);
		myset.add("Welcome");
		myset.add(true);
		myset.add('A');
		myset.add(null);
		myset.add(100);
		myset.add(null);
		
	//	System.out.println(myset.size());
		
		// insertion order not preserved
	//	System.out.println("Element in HashSet :"+myset); //[null, A, 100, 10.5, Welcome, true]
		
		
		// Removeing element from HashSet
	//	myset.remove(10.5); // 10.5 is value not index 
	//	System.out.println("Hashset element after removing  :"+myset);
		
		// Insert element not possible to insert element. Indexing not supported
		
		
		// Access specific Element Not possible , Index not support 
		
		// we can access specific element in different way
		
		/*
		ArrayList mylist = new ArrayList(myset);
		
		System.out.println("Elements in ArrayList "+mylist);
		
		System.out.println("The element present in 3rd position :"+mylist.get(3));
		
		*/
		
		/*
		// read data using for each loop
		System.out.println("Reading data using for each loop");
		for(Object element:myset)
		{
			System.out.println(element);
		}
		*/
		
		
		// read data using Iterator
		
		System.out.println("Reading data using Iterator");

		Iterator itr = myset.iterator();

		while (itr.hasNext())
		{
		    System.out.println(itr.next());
	
		}
		 
	   myset.clear();
	   System.out.println("After clearing :"+myset);
	   
	   // Checking if HashSet is empty
	  System.out.println("Is HashSet empty ? :"+ myset.isEmpty());
	  
	}

}
