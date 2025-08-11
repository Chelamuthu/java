package day4;
import java.util.Scanner;
public class rev {
public static void main(String args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int rev=0;
	while(num!=0) {
	int temp = num%10;
	rev = rev*10+temp;
	num/=10;
	}
}
}
