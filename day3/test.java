package day3;
public class test {

    public static void main(String[] args) {
        String a="Chellamuthu";
        for(int i = 0;i<a.length();i++){
            
            if(a.charAt(i)== 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u' ||
               a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U') {
                   System.out.print(a.charAt(i));
            }
            
        }
    }
}