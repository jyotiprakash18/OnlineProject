package array;

public class Demo2 
{
	public static void main(String[] args) 
	{
		int ar[][]={{10,20},{10,20,30},{10,20,30,40},{10,20,30,40,50}};
		System.out.println(ar.length);
		System.out.println(ar[0].length);
		System.out.println(ar[1].length);
		System.out.println(ar[2].length);
		System.out.println(ar[3].length);
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
}