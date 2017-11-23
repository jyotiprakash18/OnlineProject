package exceptionhandling;

public class Demo7 
{
	public static void main(String[] args) 
	{
		System.out.println("Hiiiiiiiii");
		/*if(3>2)
			throw new ArithmeticException();*/
		
		int a=Integer.parseInt("123");
		System.out.println(a);
		throw new NumberFormatException();
	}
}