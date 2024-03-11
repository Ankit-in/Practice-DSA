
public class Anagram {
	
	public void simplier(String[] arr) {
		int len=arr.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				int count=0;
				if(arr[i].charAt(i)==arr[j+1].charAt(j)) {
					count++;
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		String[] arr= {"dog","tea","eat","god","stop","post","pots"};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}
