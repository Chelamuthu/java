package day6;
import java.util.Scanner;
public class test {
public static void main(String args[] ){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=1;
	int c=0;
	for(int i=1;i<=a;i++) {
		
		if(i%2==0 && i%5==0){
			b++;
		}
		
	}
	b=(a/4)-1;
     
     System.out.println(b);
 }

}