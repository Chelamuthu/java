package day2;

public class relationaloperators {
    public static void main (String args[]){
        int a=82;
        int b=66;
        System.out.println(a<b);//false 
        System.out.println(a>b);//true 
        System.out.println(a<=b);//false
        System.out.println(a>=b);//true
        System.out.println(a==b);//false
        System.out.println(a!=b);//true
        System.out.println(a|b);//bite wise operator
        System.out.println(a==5 || b==15);//logical operator
        System.out.println(a==5 && b==15);//logical operator
        System.out.println(!(a<b));//not operator a<b is false the not changes it to true
        System.out.println(!(a>b));//not operator a>b is true the not changes it to

        //assignment operators
        int c=12;
        c+=2; //c=c+2
        System.out.println(c);
        System.out.println(c-=5);
        System.out.println(c*=12);
        System.out.println(c/=3);
        System.out.println(c%=5);
    }
    
}
