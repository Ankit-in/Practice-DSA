
public class binarysearch {
	public static int binarySearch(int[] arr, int ele) {
		if(arr==null) {
			return -1;
		}
		/*
		int start=0;
		int end=arr.length - 1;
		while(start<=end) {
			int mid=(start + end)/2;
			if(ele==arr[mid]) {
				return mid;
			}else if(ele>arr[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		*/
		
		int len=arr.length-1;
		for(int i=0;i<len;i++) {
			int mid=(len)/2;
			if(ele==arr[mid]) {
				return mid;
			}else if(ele>arr[mid]) {
				i=mid+1;
			}else {
				len=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {2,4,5,8,9,15,21};
		int index = binarySearch(input,4);
		System.out.print(index);

	}

}
