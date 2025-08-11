package day5;

import java.util.Scanner;

public class maxarray {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int arr[]=new int[a];//arr [] = new int [5]
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the arr["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("the array elements are :");
		for(int i=0;i<arr.length;i++) {
			if(max<=arr[i]) {
				max=arr[i];
			}
			
		}
	
			System.out.print(max+"is the max ");
		
}

}
