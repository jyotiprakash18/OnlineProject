package exceptionhandling;

public class Demo4 
{
	public static void main(String[] args) 
	{
		String st="Qspiders";
		int a[]={10,20,30,40};
		try
		{
			System.out.println(st.length());
			System.out.println("try block is started");
			System.out.println(a[7]);
			int s=50/0;
			System.out.println(s);
			System.out.println("try block is ended");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception occured");
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}
}