package day1;

import java.util.Scanner;
public class code3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        //class object name as s constructor name is Scaneer the constructor and the class name are same
        System.out.println("enter the age");
        int nu= s.nextInt();
        System.out.println("age is "+nu);
        System.out.println("enter the Nmae");
        String cm = s.next();
        System.out.println("enter the adress");
        System.out.println("name is "+cm);
        s.nextLine(); // consume the leftover newline
        String c = s.nextLine();
        System.out.println("your adress is "+c);
        System.out.println();
    }
}
