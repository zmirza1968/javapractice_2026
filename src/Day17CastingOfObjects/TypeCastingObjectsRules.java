package Day17CastingOfObjects;

class fruit{
	
}


class apple extends fruit 
{
	
}


class orange extends fruit 
{
	
}


public class TypeCastingObjectsRules {

	public static void main(String[] args) {
		
		
		
		// DownCasting rules 
		
		// EXAMPLE 1
		
	//	apple a = new apple();
		
	//	orange  o= (orange)a; invalid as per rule 1
		
		// EXAMPLE 2
		//fruit f = new apple();
		//orange o =(apple)f;  invalid as per rule 2
		
		// EXAMPLE 3
		
		//fruit f = new apple(); invalid as per rule 3 java.lang.ClassCastException
		//orange o= (orange)f; 
		
		
		
		
		fruit f= new apple();
		apple a=(apple)f;     // valid 3 rules satisfied
	
	}

}
