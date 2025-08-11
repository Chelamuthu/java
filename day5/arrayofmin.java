package day5;

import java.util.Scanner;

public class arrayofmin {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int arr[]=new int[a];//arr [] = new int [5]
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the arr["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		System.out.println("the array elements are :");
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			
		}
	
			System.out.print(min+"is the min ");
		
}

}
