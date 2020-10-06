
public class AddExample 
{
	public int add(int v1,int v2)
	{
		return v1+v2;
	}
	
	public int add(int v1,int v2,int v3) //# of Parameters
	{
		return v1+v2+v3;
	}
	
	public double add(double v1,double v2) //Type of Parameter
	{
		return v1+v2;
	}
	
	public static void main(String arg[])
	{
		
		AddExample obj=new AddExample();
		
		System.out.println("Add() Method of Two Integer Parameter:"+obj.add(100, 201));
		System.out.println("Add() Method of Three Integer Parameter:"+obj.add(100, 201,301));
		System.out.println("Add() Method of Two double Parameter:"+obj.add(100.5, 201.4));
		
	}
}
