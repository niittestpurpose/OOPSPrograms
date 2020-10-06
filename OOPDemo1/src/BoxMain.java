
public class BoxMain 
{
	public static void main(String args[])
	{
	//Creating an Object
	Box obj=new Box();

	//Initializing the Object
	obj.setWidth(-10);
	obj.setHeight(15);
	obj.setDepth(20);

	//Displayed all data members value
	System.out.println("Width of the Box:"+obj.getWidth());
	System.out.println("Height of the Box:"+obj.getHeight());
	System.out.println("Depth of the Box:"+obj.getDepth());
	
	System.out.println("Volume of the Box:"+obj.volume());	

	}
}
