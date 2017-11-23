package array;

public class Demo5 
{
	public static void main(String[] args) 
	{
		Object[] arr=new Object[6];
		arr[0]=new String("First Pair");
		arr[1]=new Integer(1);
		arr[2]=new String("Second Pair");
		arr[3]=new Integer(2);
		arr[4]=new String("Third Pair");
		arr[5]=new Integer(3);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}