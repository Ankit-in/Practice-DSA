import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(20);
		arr.add(30);
		arr.add(2, 40);
		System.out.println(arr.size());
		System.out.println(arr.get(2));
		System.out.println(arr);
	}
}
