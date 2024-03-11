
public class fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		if(n==0) {
			return;
		}
		if(n==1) {
			System.out.println(0);
		}
		int first=0;
		int sec=1;
		System.out.println(first);
		System.out.println(sec);
		int i=2;
		
		while(i<n) {
			int temp=first+sec;
			first=sec;
			sec=temp;
			System.out.println(temp);
			i++;
		}

	}

}
