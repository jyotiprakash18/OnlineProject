package array;

import java.util.Scanner;

public class Demo3 
{
	public static void main(String[] args) 
	{
		int row,col,i,j;
	       int arr[][]=new int[3][3];
	       Scanner sc=new Scanner(System.in);		   
	       System.out.print("Enter Number of Row for Array (max 3) : ");
	       row = sc.nextInt();
	       System.out.print("Enter Number of Column for Array (max 3) : ");
	       col = sc.nextInt();		   
	       System.out.print("Enter " +(row*col)+ " Array Elements : ");
	       for(i=0;i<row;i++)
	       {
	           for(j=0;j<col;j++)
	           {
	               arr[i][j]=sc.nextInt();
	           }
	       }		   
	       System.out.print("The Array is :\n");
	       for(i=0;i<row;i++)
	       {
	           for(j=0;j<col;j++)
	           {
	               System.out.print(arr[i][j]+ "  ");
	           }
	           System.out.println();
	       }
	}
}