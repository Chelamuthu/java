package day5;
import java.util.Scanner;
public class arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];//arr [] = new int [5]
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the arr["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("the array elements are :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	
	}

}
