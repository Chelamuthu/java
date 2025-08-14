package day8;

class dad{
	void property() {
		System.out.println("House,land");
	}
}
class son extends dad{
	void show(){
		System.out.println("bike , car");
	}
}
public class inheritance {

	
	public static void main(String args[]) {
		son s=new son();
		s.property();
		s.show();
	}
}
