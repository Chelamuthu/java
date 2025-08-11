package day4;
import java.util.Scanner;
public class factorofgivenno {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=0;
	for(int i=1;i<=a;i++) {
		if(a%i==0) {
			b+=1;
			System.out.println(i);
		}
	}
	System.out.println("total count"+b);
	
}
}
