package day8;

public class staticmethod {
	int rollno=9156;
	String name="chellamuthu";
	static String collegename="Zion";
	void display(int a,String b) {
		System.out.println("Spr.No : "+a+" name : "+b+" collegename : "+collegename);
	}

	static void show(int a) {
		
		staticmethod.collegename="MountZion";
		System.out.println("Spr.No : "+a+" collegename : "+collegename);
	}
	public static void main(String[] args) {
		staticmethod s=new staticmethod();
		s.display(9175,"Santhosh");
		staticmethod.show(s.rollno);
		

	}

}
