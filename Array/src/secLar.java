
public class secLar {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,8,9};
		System.out.print(secLgesteven(arr));
		}

	public static int secLgesteven(int[] arr) {
		int largest=arr[0];
		int seclargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				if(arr[i]>largest) {
					seclargest=largest;
					largest=arr[i];
				}
				else if(seclargest < arr[i] && arr[i]!=largest) {
					seclargest=arr[i];
					System.out.println();
				}
			}
		}
		return seclargest;
	}

}
