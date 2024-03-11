package clssobj;

public class vehicalUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vehical v1;
		v1=new HondaAcord();
		System.out.println(v1.isNew());
		System.out.println(v1.fuelType());
		System.out.println(v1.manufacturedIn());
		v1=new bike();
		System.out.println(v1.isNew());
		System.out.println(v1.fuelType());
		System.out.println(v1.manufacturedIn());
		
	}

}
