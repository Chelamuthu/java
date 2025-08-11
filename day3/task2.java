package day3;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        float s=sc.nextFloat();
        float r=sc.nextFloat();
        float l=sc.nextFloat();
        if((x*s)+(y*s)>l){
            
            System.out.println("Monthly Pass");
        }
        else if((x*s)+(y*s)<s | (x*r)+(y*r)<r ){
            System.out.println("Solo Trail + Roundabout Ride");
        }
        else{
                    System.out.println("Invalid Inpu");
            }
           }
}