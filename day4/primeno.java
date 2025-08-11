package day4;
import java.util.Scanner;
public class primeno 
{
public static void main(String args[]) 
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int count=0;
	for(int i=2;i<=a;i++) 
	{
		if(a%i==0) 
		{
			count++;	
		}
	}
	if(count==1) 
	{
		System.out.println("prime");
	}
	else 
	{
		System.out.println("not a prime");
	}
}

}
