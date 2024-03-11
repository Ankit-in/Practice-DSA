
public class fuse0 {
    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int k=0;
        int i;
        for(i=0;i<arr.length;i++){
        	if(arr[i]!=0){
        		int temp=arr[i];
                arr[i]= arr[k];
                arr[k] = temp;
                k++;
        	}
        }
//        for(int i=k;i<arr.length;i++){
//            System.out.print("0"+" ");
//        }
        
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {2,0,0,1,3,0};
		pushZerosAtEnd(input);
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}

	}

}
