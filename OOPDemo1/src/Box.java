
public class Box 
{
	private double width;
	private double height;
	private double depth;
	
	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(double w)
	{
		width=(w>0)?w:1;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double h)
	{
		height=(h>0)?h:1;
	}
	
	public double getDepth()
	{
		return depth;
	}
	
	public void setDepth(double d)
	{
		depth=(d>0)?d:1;
	}
	
	public double volume()
	{
		return width*height*depth;
	}
}
