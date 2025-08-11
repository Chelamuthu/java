package day4;
import java.util.Scanner;

public class code1 {
	//odd coutn and even count 
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=0;
	int d=0;
	for(int i=a;i<=b;i++){
		if(i%2==0) {
			c+=1;
		}
	}
	System.out.println("total even number is "+c);
	
	for(int i=a;i<=b;i++){
		if(i%2!=0) {
			d+=1;
		}
	}
	System.out.println("total odd number is "+d);
	
}
}
