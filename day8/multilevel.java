package day8;
class grandpa
{
	void display() 
	{
		System.out.println("villa");
	}
}
class a extends grandpa{
	void property() {
		System.out.println("House,land");
	}
}
class b extends a{
	void show() {
		System.out.println("Bike , car");
	}
}

public class multilevel {
	public static void main(String args[]) {
	
		b s=new b();
		s.display();
		s.property();
		s.show();
		
}
}
