
public class SumTheArrays {
	public static void sumArray(int[] arr1, int[] arr2, int[] output) { 
        for(int i=arr1.length-1;i==0;i--){
            for(int j=arr2.length-1;j==0;j--){
                for(int z=output.length-1;z==0;z--){
                    output[z]=arr1[i]+arr2[j];
                }
            }
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
