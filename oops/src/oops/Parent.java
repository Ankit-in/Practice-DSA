package oops;

class Parents{
	void name() {
		System.out.println("Ankit");
	}
}

public class Parent {
	
	public static void main( String[] args) {
		Child c = new Child();
	}

}
class Child extends Parents{
	void name() {
		System.out.println("Singh");
	}
}

