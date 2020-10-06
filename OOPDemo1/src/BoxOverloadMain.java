
public class BoxOverloadMain 
{
	public static void main(String arg[])
	{
		
		BoxOverload defaultBoxObj=new BoxOverload();
		
		BoxOverload squareBoxObj=new BoxOverload(10);
		
		BoxOverload userDefinedBoxObj=new BoxOverload(10,11,12);
		
		System.out.println("Default Box Volume:"+defaultBoxObj.volume());
		
		System.out.println("Square Box Volume:"+squareBoxObj.volume());
		
		System.out.println("UserDefine Box Volume:"+userDefinedBoxObj.volume());
	}
}
