public class PuseZend {

    public static void main(String[] args) {
        int arr[] = {2,0,0,3,5,0,0};

        int[] result = pushZerotoend(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] pushZerotoend(int[] arr) {
        /* int arr_length = arr.length;
        int end = arr_length - 1;
        int i = 0;
        int temp;
        while (i < end ) {
            if (arr[i] == 0 && arr[end] != 0) {
                temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;
                i++;
            } else if (arr[i] != 0 && arr[end] != 0) {
                i++;
            } else if (arr[i] != 0 && arr[end] == 0) {
                end--;
                i++;
            } else {
                end--;
            }
            
            {2,0,0,3,5,0,0}
        } */
    	
    	int k=0;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]!=0) {
    			arr[k++]=arr[i];
    		}
    		
    	}
    	while(k<arr.length) {
    		arr[k]=0;
    		k++;
    	}
    	
    	
    	System.out.println(k);
        return arr; 
    }
}
