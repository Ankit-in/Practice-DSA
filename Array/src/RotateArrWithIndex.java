import java.util.Scanner;

public class RotateArrWithIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Take arr len:");
		int len=s.nextInt();
		System.out.println("take rotateIndex:");
		int rotateIndex=s.nextInt();
		System.out.println("take arr element:");
		int[] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=s.nextInt();
		}
		int[] result=rotateArraybyIndex(arr,rotateIndex);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
		}

	}

	private static int[] rotateArraybyIndex(int[] arr, int rotateIndex) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-rotateIndex;i++) {
			int temp=arr[i];
			arr[i]=arr[i+rotateIndex];
			arr[i+rotateIndex]=temp;
		}
		return arr;
	}

}
