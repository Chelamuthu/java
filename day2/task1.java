package day2;
import java.util.Scanner;
public class task1 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=a%2;
        // String num =(a%2==0)?"even":"odd";
        // System.out.println(num);
        System.out.println("enter ur age");
        int age =sc.nextInt();
        String b =(age<=18)?"you are not eligible to vote ":"you are eligible to vote";
        System.out.println(b);

    }
}
