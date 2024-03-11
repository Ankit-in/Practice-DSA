
public class Insertionsort {
	public static void insertionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int j=i;
			int temp=arr[i];
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				
				j--;
			}
			arr[j]=temp;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {6,5,4,2,1};
		insertionSort(input);
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+ " ");
		}

	}

}
