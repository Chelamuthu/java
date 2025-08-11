package day3;
import java.util.*;

public class switchcase {
     public  static void fun(int num, String result){
         
            if(num<33){
               result = "Inflate";
            }
            else if(num<33){
                result ="Deflate";
            }
            else if(num == 33){
                result ="Inflate";
            }
         
        }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        
       switchcase.fun(a, "");
       switchcase.fun(b, "Deflate");        
         switchcase.fun(c, "Inflate");
         switchcase.fun(d, "Deflate");
       
    }
}