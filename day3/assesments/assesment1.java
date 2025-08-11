package day3.assesments;

import java.io.*;
import java.util.*;

public class assesment1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a=sc.next();
        int b=0;
        int c=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='4'){
                b = 1;
            }
            if(a.charAt(i)=='7'){
                c = 1;
            }
            
        }
        if(b==1 && c==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}