package Day23CollectionsHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		// Declaration		
		//HashMap hm = new HashMap(); // HashMap contains key and value 
		//Map<Integer, String> hm = new HashMap<Integer, String>();
		
		/*
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		// Adding pairs to HashMap
		
		hm.put(101,"John");
		hm.put(102,"Scott");
		hm.put(103,"Mary");
		hm.put(104,"John"); // duplicate values are allowed
		hm.put(105,"null");
		hm.put(102,"Mathew"); // key 102 duplicate not allowed
		hm.put(null,null);
		*/
		
	//	System.out.println("HashMap Data :"+hm);
		//{null=null, 101=John, 102=Scott, 103=Mary, 104=John, 105=null}
		
		// Remove pair hashmap
		//hm.remove(102);
		//System.out.println("HashMap Data :"+hm);
		
	//	hm.get(104);
	//	System.out.println("The value of 104 Key :"+hm.get(104));
		
		// Accessing allthe key srom HashMap
		
	//	System.out.println("Key in the HashMap :"+hm.keySet());
		
		//accessing allthe values form HashMap
		
	//	System.out.println("values int the HashMap :"+hm.values());
		
		// Reading HashMap using for each loop
		
		/*
		
		for(Integer key:hm.keySet())
		{
			System.out.println(key + " "+hm.get(key));
		}
		*/
		/*
		 * null null
101 John
102 Mathew
103 Mary
104 John
105 null
		 */
		
		
		/*
		Iterator it = hm.keySet(). iterator();
		
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
		*/
		
		
		/*
		Iterator it = hm.entrySet().iterator();

		while (it.hasNext()) 
		{
		    Map.Entry entry = (Map.Entry) it.next();

		    System.out.println(entry.getKey() + " " + entry.getValue());
		    
		}
		*/
		
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		// Adding pairs to HashMap
		
		hm.put(101,"John");
		hm.put(102,"Scott");
		hm.put(103,"Mary");
		hm.put(104,"John"); // duplicate values are allowed
		hm.put(105,"null");
		hm.put(102,"Mathew"); // key 102 duplicate not allowed
		hm.put(null,null);
		
		
		
		
		for(Integer key:hm.keySet())
	       {
			System.out.println(key + " "+hm.get(key));
		}
		
		
		/*
		Iterator <Entry <Integer,String>>itr = hm.entrySet().iterator();
		
		while (itr.hasNext())
		{
			Entry <Integer,String >entry=itr.next();
			System.out.println(entry.getKey() + "   "+entry.getValue());
		}
		  */
		
		/*
	Iterator <Integer>itr=hm.keySet().iterator();
	while(itr.hasNext())
	{
		Integer key=itr.next();
		System.out.println(key +"   "+hm.get(key));
	}
		hm.clear();
		System.out.println(hm.isEmpty());
		/*
		}*/
	}
	}


