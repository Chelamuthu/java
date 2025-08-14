package day6;

import java.util.Scanner;

public class additionofarray {

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
			System.out.println("enter the row");
			int row2 =sc.nextInt();
			System.out.println("enter the col2");
			int col2 =sc.nextInt();
			int arr2[][] = new int [row2][col2];
			int arr3[][] = new int [row2][col2];
			for(int i=0;i<arr.length;i++) 
			{
				for(int j=0;j<col;j++) 
				{
					System.out.print("enter ["+i+"]["+j+"] : ");
					arr[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<arr2.length;i++) 
			{
				for(int j=0;j<col2;j++) 
				{
					System.out.print("enter ["+i+"]["+j+"] : ");
					arr[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<arr2.length;i++) 
			{
				for(int j=0;j<col2;j++) 
				{
					System.out.print("enter ["+i+"]["+j+"] : ");
					arr[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<arr3.length;i++) 
			{
				
					for(int j=0;j<col2;j++) 
					{
						arr3[i][j]=arr[i][j]+arr2[i][j];					
					}
					System.out.println();
				
				System.out.println();
				}
			}
			
		}
					

	

