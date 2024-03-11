package run;

public class Run2 {
	public static void get()
	{
		System.out.print("Base");
	}
}

class Test extends Run2 {
	public static void get()
	{
		System.out.println("Test");
	}
	public static void main(String[] args) {
		Test obj = new Test();
		obj.get();
	
		Run2 b = new Test();
		b.get();
	}
}