package Oops;

class Parent{
	
	public Parent() {
		System.out.println("Parent const.");
	}
	void abcd() {
		System.out.println("method parent");
	}
	
	void name(int age,int rollno) {
		System.out.println("Output");
	}
	void name(){
		System.out.println("Ankit");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("child cont");
	}
	void abc() {
		System.out.println("this child class method");
	}
	void name() {
		//super.name(5,10);
		System.out.println("Singh");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1= new Parent();
		p1.name();
		System.out.println("---------");
		Child c = new Child();
		c.name();
		c.abcd();
		System.out.println("---------");
		Parent p = new Child(); //it will 1st checks for parent class if method parent and also same method parsent in child clss then print child method.
		p.name();
		p.abcd();
		
		//p.abc();
		
	}

}