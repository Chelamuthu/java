package day7;

public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Chella";
		String str1="Chella";
		String str2=new String("Chella");
		String str3=new String("hi");
		System.out.println(str);
		System.out.println(str==str1);
		System.out.println(str.equals(str3));
		System.out.println(str.equalsIgnoreCase(str3));
		System.out.println(str.length());
		System.out.println(str.trim().length());
		System.out.println(str.length());
		String word[]=str.split(" ");
		for(String var:word) {
			System.out.println(var);
		}
		System.out.println(str2.substring(1,5));
		System.out.println(str2.contains("Ch"));
		System.out.println(str2.endsWith("a"));
		System.out.println(str2.charAt(3));
		System.out.println(str2.concat(" Muthu "));
		System.out.println(str2);
		//string buffer is syncroniced
		//String builder phause multiple
		
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		sb.append(", World!");
		System.out.println(sb);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(0,1);
		
		
	}

}
