package day7;
import java.util.Scanner;
//method syntax access specifier return type (parameters)
//{
//scope of the block
//}

public class meth {
	
	//with argument and with return type
	public int add(int a,int b)
	{
		return a+b;
	}
	
	//without argument, &without return
	public void display(){
		System.out.println("Helo World");
	}
	
	//with argument, &without return
	public void mult(int a,int b){
		
		System.out.println("Mutliplication of A * B = "+a*b);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		meth b=new meth();;
		b.display();
		System.out.println("Enter the first Element : ");
		int a=sc.nextInt();
		System.out.println("Enter the Second Element : ");
		int c=sc.nextInt();
		int res=b.add(a,c);
		System.out.println("addition of A + B = "+res);
		b.mult(a, c);

	}

}
