package day2;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first element as a = ");
        int a=sc.nextInt();
         System.out.println("enter the first element as b = ");
        int b=sc.nextInt();
        System.out.println("a = "+a+" b = "+b);
        int c;
        c = a; 
        a = b; 
        b = c; 
        System.out.println("a = "+a+" b = "+b);

    }
}
