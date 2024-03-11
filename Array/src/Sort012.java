import java.util.Scanner;

public class Sort012 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Take size of arr: ");
		int size=s.nextInt();
		System.out.println("Take arr element: ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		int[] result=sortZeroOneTwo(arr);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
		}

	}

	private static int[] sortZeroOneTwo(int[] arr) {
		int first=0;
		int last=arr.length-1;
		int i=0;
		while(i<=last) {
			if(arr[i]==0) {
				int temp=arr[i];
				arr[i]=arr[first];
				arr[first]=temp;
				i++;
				first++;
			}else if(arr[i]==2) {
				int temp=arr[i];
				arr[i]=arr[last];
				arr[last]=temp;
				last--;
			}
			else {
				i++;
			}
		}
		
		return arr;
	}

}
