import java.util.Scanner;

public class bubblesort {
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length - i -1;j++ ) {  //yaha pe (i<arr.length - 1) v ho skta but for optimization we think that ki last s v value sort ho rhe h j m so we use this 
				if(arr[j]>arr[j+1]) { 
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int[] input= new int[5];
		for(int i=0;i<input.length;i++) {
			input[i]=s.nextInt();
		}
		bubbleSort(input);
		
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+ " ");
		}

	}

}
