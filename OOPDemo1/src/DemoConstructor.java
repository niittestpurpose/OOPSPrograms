
public class DemoConstructor 
{
	public DemoConstructor(int v) //Parameterized Constructor
	{
		System.out.println("===========Parameterized Constructor Invocation=============");
	}
	
	public static void main(String arg[])
	{
		System.out.println("==========Main() Method Invocation==============");
		
		//Creating the Object
		DemoConstructor obj1=new DemoConstructor(45); //Java will provide the default constructor.
		
		System.out.println("============I am Again in Main() Method===========");
	}
}
