import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pairofsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int sum=s.nextInt();
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		pairOfSum(arr,sum);

	}

	private static void pairOfSum(int[] arr,int sum) {
		LinkedHashMap<Integer,Integer> m=new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(m.containsValue(sum-arr[i])) {
				System.out.println(arr[i]+" "+(sum-arr[i]));
			}else {
				
				m.put(i, (sum-arr[i]));
			}
		}
	}
}