package day5;

import java.util.Scanner;

public class code1 {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				int arr[]=new int[a];//arr [] = new int [5]
				for(int i=0;i<arr.length;i++) {
					System.out.println("enter the arr["+i+"] : ");
					arr[i]=sc.nextInt();
				}
				
				System.out.println("the array elements are :");
				for(int i=0;i<arr.length;i++) {
					if(i%2==0) {
					System.out.print(arr[i]+" ");
				}
				}
	}

}
