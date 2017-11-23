package exceptionhandling;

public class Demo6 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("try block started");
			int a=Integer.parseInt("Qspiders");
			System.out.println(a);
			System.out.println("try block ended");
		}
	catch(Exception e)
		{
			System.out.println("Exception is occured");
			e.printStackTrace();
		}
	}
}