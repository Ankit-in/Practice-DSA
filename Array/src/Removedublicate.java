import java.util.HashSet;
import java.util.Set;

public class Removedublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2,3,4,5,5,6};
		removeDublicate(arr);

	}

	public static void removeDublicate(int[] arr) {
		Set<Integer> hs=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs);
		
		
		
	}

}
