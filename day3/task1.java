package day3;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the mark");
        int a=sc.nextInt();
        if( a>90 && a<=100){
            System.out.println("A+");
        }
        else if( a>80  && a<=89){
System.out.println("A");
        }
        else if( a>70 && a<=79){
System.out.println("B");
        }
        else if ( a>60 && a<=69) {
            System.out.println("C");

        }
        else if( a>50 && a<=59){
System.out.println("D");
        }
        else if (a<50){
            System.out.println("FAil");
        }
        else{
            System.out.println("entered mark is wrong");
        }
    }
}
