
public class tst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,2,3,4,5};
		increment(arr);
		for (int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
			}
		}

	private static void increment(int[] arr2) {
		// TODO Auto-generated method stub
		int [] arr1= {1,2,3,4,5};
		arr2=arr1;
		for (int i=0;i<5;i++)
		{
			arr2[i]++;
			System.out.println(arr2[i]);
		}
	}


}
