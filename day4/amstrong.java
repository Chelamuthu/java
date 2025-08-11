package day4;
import java.util.Scanner;
public class amstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int temp=a;
		int b=0;
		int c=0;
		while(a!=0) {
			b=a%10 ;
			if(temp<1000) {
			c+=b*b*b;}
			else if(temp<10000 && temp>1000){
				c+=b*b*b*b;
			}else {
				c+=b*b;
			}
			a/=10;
			
		}
		
		if(temp==c){
		System.out.println(c+" is  amstrong number");
		}
		else {
			System.out.println(c+" is not amstrong number");
		}
		
	}
	}
