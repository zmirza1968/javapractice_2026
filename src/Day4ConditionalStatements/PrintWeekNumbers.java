package Day4ConditionalStatements;

public class PrintWeekNumbers {

	public static void main(String[] args) {

		String weekname = "Friday";
		
		if(weekname=="Sunday") {
			System.out.println(1);
		}
		else if(weekname=="Monday") {
			System.out.println(2);
		}
		else if(weekname=="Tuesday") {
			System.out.println(3);
		}
		else if(weekname=="Wednesday") {
			System.out.println(4);
		}
		else if(weekname=="Thursday") {
			System.out.println(5);
		}
		else if(weekname=="Friday") 
		{
			System.out.println("6");
		}
		else if (weekname=="Saturday") {
			System.out.println(7);
		}
		else {
			System.out.println("Invalid week name");
		}
	}

}
