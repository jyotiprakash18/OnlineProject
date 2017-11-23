package exceptionhandling;

public class Demo5 
{
	public static void main(String[] args) 
	{
		try
		{
			String s=null;
			System.out.println("try block started");
			int a=Integer.parseInt("123");
			System.out.println(a);
			System.out.println(s.length());
			System.out.println("try block ended");
		}
		catch(Exception e)
		{
			System.out.println("Exception is occured");
			e.printStackTrace();
		}
	}
}