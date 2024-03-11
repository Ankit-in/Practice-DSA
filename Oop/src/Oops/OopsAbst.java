package Oops;

abstract class Animal{ 
	 abstract void move();
}
class Human extends Animal{
	 void move(){
	 System.out.println("I can walk and run");
	 }
}
class Snake extends Animal{
	 void move(){
	 System.out.println("I can crawl");
	}
}
class Dog extends Animal{ //Subclass 3
	 void move(){
	 System.out.println("I can bark");
	 }
}

public class OopsAbst {

	public static void main(String[] args) {
		Animal R = new Human();
		 R.move();
		 Animal K =new Snake();
		 K.move();
		 R =new Dog();
		 R.move();
	}

}
