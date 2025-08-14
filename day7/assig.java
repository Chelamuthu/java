package day7;
import java.util.Scanner;
public class assig {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((int)ch<97) {
				System.out.print((char)(ch+32));
			}else {
				System.out.print((char)(ch-32));
			}
	}
}
}

