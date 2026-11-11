package Day13OverRidingOverLoading;

public class Box {
	
	
	//Constructor Overloading
	
	double width,height,depth;
	
	Box ()
	{
		width =height=depth=0;
	}
	
	
	Box (double side)
	{
		width =height=depth=side;
	}
	
	Box(double width,double height, double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	double volume() 
	{
		return width*height*depth;
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) 
	{
		Box b1 = new Box();
		System.out.println(b1.volume());
		
		Box b= new Box(10);
		System.out.println(b.volume());
		
		Box b2= new Box(2,5,10);
		System.out.println(b2.volume());
		
		Box b3= new Box(10.5,50.4,35.0);
		System.out.println(b3.volume());
		
		//51
		
	}

}
