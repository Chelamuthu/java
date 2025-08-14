package day8;

public class stat {
//static variable allocate the memory in class
	int rollno = 9156;
	String name="chella";
	
	static String  collegename="Mount Zion";
	void display(int a,String b) {
		System.out.println("Spr.No : "+a+" Name :  "+b+" College Name : "+collegename);
	}
	public static void main(String[] args) {
		stat s=new stat();
		s.display(s.rollno,s.name);
		s.display(9999, "Shameer");
		s.display(9175, "Santhosh");
		stat.collegename="Zion"; //classname.variable= ; chage the static variables  value
		s.display(s.rollno, s.name);
		s.rollno=9407;
		s.name="sundar";
		s.display(s.rollno,s.name);
	}

}
