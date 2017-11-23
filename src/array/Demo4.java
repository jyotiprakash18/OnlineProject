package array;

public class Demo4 
{
	public static void main(String[] args) 
	{
		String ar[][]={{"George","Bailey"},{"Steve","Smith"},{"Glenn","Maxwell"},{"David","Warner"}};
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