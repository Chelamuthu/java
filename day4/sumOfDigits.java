package day4;
import java.util.Scanner;
public class sumOfDigits {
	//123=1+2+3=6 the sum of the digits
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b=0;
	while(a!=0) {
		
		b+=a%10; //b=b+(a%10); 
		a/=10;
	}
	if(b>=10) {
		a=b;
		b=0;
		while(a!=0) {
			b+=a%10; //b=b+(a%10); 
			a/=10;
		}
		System.out.println("the sum is more then 10 it can again sumed value is "+b);}
	else {
		System.out.println("the sum is less then 10 the value is "+b);
	}
}
}
