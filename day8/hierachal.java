package day8;

class g
{
	void display() 
	{
		System.out.println("villa");
	}
}
class aa extends g {
	void property() {
		System.out.println("House,land");
	}
}
class bb extends g{
	void show() {
		System.out.println("Bike , car");
	}
}

public class hierachal {
	public static void main(String args[]) {
		aa a=new aa();
		bb s=new bb();
		s.display();
		a.property();
		s.show();
		
}
}
