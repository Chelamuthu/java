package day6;
import java.util.Scanner;
public class task1 {

	//s shape to print the array 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row");
		int row =sc.nextInt();
		System.out.println("enter the col");
		int col =sc.nextInt();
		int arr[][] = new int [row][col];
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<col;j++) 
			{
				System.out.print("enter ["+i+"]["+j+"] : ");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) 
		{
			if(i%2==0) 
			{
				for(int j=0;j<col;j++) 
				{
					System.out.print(arr[i][j] +" ");					
				}
				System.out.println();
			}
			else 
			{
				for(int j=col-1;j>=0;j--) 
				{
					System.out.print(arr[i][j] +" ");
				}
				System.out.println();
			}
		}
		
	}
				

}

