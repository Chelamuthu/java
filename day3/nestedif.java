package day3;
import java.util.Scanner;
public class nestedif {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
if (age>=18) {
    System.out.println(" ur  eligible to vote");
    if (age>=25) {
        System.out.println("ur eligible for canditate");
    }
    else{
        System.out.println("ur  not eligible for canditate");
    }
}
else{
    System.out.println(" ur not eligible to vote");
}
    }
}
