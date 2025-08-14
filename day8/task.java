package day8;

public class task {
	int teamid=001;
	String teamName="Zion Racing 2.0";
	static String college="Mount Zion";
	
	void display(int a,String b) {
		System.out.println("Team Id : "+a+" Team Name : "+b+ " --- College : "+college);
	}
	void show(int a,String b) {
		task.college="Zion";
		System.out.println("Team Id : "+a+" Team Name : "+b +"       --- College : "+college);
	}
	
	
	//static block  
	static{
		
		System.out.println("welcome to Gokart Racing");
	}
		
	public static void main(String[] args) {
		task s=new task();
		s.display(s.teamid,s.teamName);
		s.teamid=2;
		s.teamName="Telemetry";
		s.show(s.teamid,s.teamName);

	}

}
