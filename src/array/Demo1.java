package array;

public class Demo1 
{
	public static void main(String[] args) 
	{
		int ar[]=new int[5];
		System.out.println(ar.length);
		System.out.println("**************");
		ar[1]=10;
		ar[0]=14;
		ar[4]=25;
		ar[3]=30;
		ar[2]=26;
		//ar[5]=56;
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}