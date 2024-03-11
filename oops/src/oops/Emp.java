package oops;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Emplo{
	static int Roll;
	static int age;
	int empId;
	String name;
	
	@Override
	public int hashCode() {
		return Objects.hash(empId, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emplo other = (Emplo) obj;
		return empId == other.empId && Objects.equals(name, other.name);
	}
	Emplo(int Roll,int age,String name){
		this.Roll=Roll;
		this.age=age;
		this.name=name;
	}
	static void write() {
		System.out.println("I'm writting");
		age++;
		//empId++; error static method can not access non static field;
		//read(); error static method can not access non static method;
		
	}
	void read() {
		System.out.println("i'm reading ");
		age++;
		empId++;
		write();
		
	}
}


public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplo.age=5;
		Emplo.write();
		
		Map<Emplo,String> map= new HashMap<Emplo,String>();
		
		System.out.println(Emplo.age);
		Emplo e = new Emplo(10,20,"Ram");
		System.out.println("Hashcode1:"+e.hashCode());
		
		map.put(e,"Data1");
		
		
		
		Emplo e1 = new Emplo(10,20,"Ram");
		System.out.println("Hashcode2:"+e1.hashCode());
		
		System.out.println("fetching map: "+map.get(e1));
		
		
		//e.age=56;
		Emplo.write();
		e.read();
		
		e.empId=2;
		
		System.out.println(e.age);//output=23 for static can be update by obj also
		Emplo f=new Emplo(30,40,"Ankit");
		f.age=56;
		System.out.println(f.age); //output=56 for static var. can be update by obj but remain same for all object if not updated in new obj.
		System.out.println(e.empId);//output=2, as it is non static var
		System.out.println(f.empId); // output= 0 for non static var as it is non static var so ever time when obj is created we have to initiate the var.
		
		
		

	}

}