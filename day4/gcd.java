package day4;
import java.util.Scanner;
public class gcd {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c = (a<b)? a:b;
	int gcd=0;
 
	for(int i=1;i<=c;i++) {
		if(a%i==0 && b%i==0  ) {
			if(gcd<=i) {
			gcd=i;
			
	
		}
		
		}
		
	}
	System.out.println("gcd is "+gcd);
}
}
