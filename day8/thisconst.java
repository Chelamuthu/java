package day8;

public class thisconst {
	int age;//instance variable
	String name;//instance variable
	
	thisconst(){
		System.out.println("default");
	}

	thisconst(int a,String b){
		this.age=a;
		this.name=b;
	}
	
	void display() {
		System.out.println(age+" "+name);
	}
	void show() {
		System.out.println("hello show");
		this.display();
	}
	
public static void main(String arg[]) {
	thisconst a1=new thisconst();
	thisconst a=new thisconst(1,"ChellaMuthu S");
	a.show();
}
}

