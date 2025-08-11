package day5;
import java.util.Scanner;
public class palindrome {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int n=a;
	int b=0;
	while(a!=0) {
		int temp=a%10;
		b=b*10+temp;
		a/=10;
		
	}
	System.out.println(b);
	if(b==n) {
		System.out.println("it is palindrome");
	}else {
		System.out.println("it is not palindrome");
	}

}
}
