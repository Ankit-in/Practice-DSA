
public class rotateThearrary {
	public static void rotate(int[] arr, int d) {
    	//Your code goes here
		int[] arr1 = new int[arr.length];
        int i;
		for(i= 0;i < arr.length;i++) {
			arr1[i] = arr[i];
		}
		for(i = 0;i < arr.length - d;i++) {
			arr[i] = arr1[i+d];
		}
		for(int j = i;j < arr.length;j++) {
			arr[j] = arr1[d - arr.length + j];
		}
    }

        

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1,3,4,5,6,7};
		rotate(input,2);
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]+" ");
		}
		
		

	}

}
