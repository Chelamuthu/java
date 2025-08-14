package day7;

public class code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer a=new StringBuffer("Hello World");
System.out.println(a);
a.reverse();
System.out.println(a);
String b=a.toString();
String word[]=b.split(" ");
for(String var:word) {
	
	System.out.println(var);
}

	}

}
