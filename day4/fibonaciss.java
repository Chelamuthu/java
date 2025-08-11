package day4;

import java.util.Scanner;

public class fibonaciss {

public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int x=0;
	int n=1;
	int m=0;
	int i=0;
	while(i<a) {
		
		System.out.println(x);//012
		x=n+m;//123
		m=n;//m=112
		n=x;//m=123
		i++;
	}

}
}
