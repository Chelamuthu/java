package day8;
public class constructor {
	int age;
	String name;
	
	constructor(){
		System.out.println("default");
	}

	constructor(int a,String b){
		age=a;
		name=b;
	}
	
	void display() {
		System.out.println(age+" "+name);
	}
	
	
public static void main(String arg[]) {
	//default condtruct 
	constructor a1=new constructor();
	//parameterised constructor 
	constructor a=new constructor(1,"Cm");
	a.display();
}
}
