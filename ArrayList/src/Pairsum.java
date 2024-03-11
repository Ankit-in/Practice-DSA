import java.util.HashSet;
import java.util.Set;

public class Pairsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,7,9,3,2};
		pairsum(arr,5);
		

	}

	public static void pairsum(int[] arr,int sum) {
		Set<Integer> hs=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(hs.contains(sum-arr[i])) {
				System.out.println(arr[i]+ " " + (sum-arr[i]));
				break;
			}else {
				hs.add(arr[i]);
			}
		}
		
		
	}

}