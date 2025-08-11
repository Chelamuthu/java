package day2;
import java.util.Scanner;

public class Sumofdigit {

    

public static void main(String args[]){
    System.out.println("enter the two digit number to find the sum of digits");
    Scanner s = new Scanner(System.in);
    int a= s.nextInt();
    int b=(a/10)+(a%10);//remainder and the quotient
    System.out.println("sum of the two digit "+ b);

    System.out.println("enter the three digit ");

    int a1= s.nextInt();
    int b1=(a1/10)+(a1%10);//remainder and the quotient
    int c =(b1/10)+(b1%10);//remainder and the quotient
    System.out.println("sum of the three digit "+ c);
    
    // get the last two digit  num%100
    // get the last three digits num %1000
    
}
}
