package abstraction;

abstract class Cars{
	
	abstract String speed();
	int gear() {
		return 5;
		
	}
}
class Tata extends Cars{

	@Override
	String speed() {
		// TODO Auto-generated method stub
		return "100";
	}


	
	}
	
class Bmw {

	String speed() {
	
		return "200";
	}
	
}


public class Car {
	
	public static void main(String[] args) {
		Tata t = new Tata(); 
		Cars c =new Tata();
		//Cars b = new Car();
		//b.speed();
		c.speed();
		t.speed();
		System.out.println(t.speed());
		System.out.println(c.speed());
		//System.out.println(b.speed());
	}

	//@Override
	//String speed() {
		// TODO Auto-generated method stub
		//return "50;
	//}
}