import java.util.ArrayList;
import java.util.List;

public class Al {

	public static void main(String[] args) {
		List<String> l1= new ArrayList<>();
		l1.add(null);
		l1.add(0,"A");
		l1.add(2,"B");
		l1.add("17");
		//l1.add(1,10);
		System.out.println(l1);
	}

}
