package day3.assesments;
import java.io.*;
import java.util.*;

public class assesment2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        float s=sc.nextFloat();
        float r=sc.nextFloat();
        float l=sc.nextFloat();
        if(s<r && (2*s>r)){
            if(((x*s)+(y*r))>l){
            System.out.println("Monthly Pass");
            }else{
            System.out.println("Solo Trail + Roundabout Ride");
        }
        }else{
            System.out.println("Invalid Input");
        }
    }
}