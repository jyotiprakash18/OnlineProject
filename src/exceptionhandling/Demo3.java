package exceptionhandling;

import java.util.Scanner;

public class Demo3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		System.out.println("Enter b value:");
		int b=sc.nextInt();
		try
		{
			int c=a/b;
			System.out.println(c);
			System.out.println("************");
		}
		catch(ArithmeticException e)
		{
			System.out.println("b value must be non-zero");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("i am finally executed");
		}
	}
}