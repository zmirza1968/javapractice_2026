package Day23CollectionsHashMap;

import java.util.HashMap;

class Book
{
	int id;
	String name ,author;
	int qty;
	
	Book(int id, String name, String author,int qty)
	{
		
		this.id=id;
		this.name=name;
		this.author=author;
		this.qty=qty;
		
	}
}





public class HashMapwithObjects {

	public static void main(String[] args) {
		
		Book b1 =new Book(101,"Java programming","Smith",2);
		Book b2 =new Book(102,"Selenium","Scoot",3);
		Book b3 =new Book(103,"postmanAPI","David",4);
		
		HashMap <Integer,Book>hm = new HashMap<Integer,Book>();
		
		hm.put(1, b1);
		hm.put(2, b2);
		hm.put(3, b3);
		
		
		for(Integer key:hm.keySet())
		{
			String author=hm.get(key).author;
			Integer id=hm.get(key).id;
			String name=hm.get(key).name;
			Integer qty=hm.get(key).qty;
			
			
			System.out.println(key +"  " +author+ "  "+id+ "  "+name+ " " +qty);
		}
		
		
	}

}






