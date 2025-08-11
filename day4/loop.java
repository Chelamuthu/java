package day4;
import java.util.Scanner;
public class loop {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b=0;
	while(a!=0) {
		a/=10;
		b++;
	}
	System.out.println(b);
}
}
