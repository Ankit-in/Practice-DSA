package run;
import java.util.Scanner;
public class BinaryTodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int ans=0;
		if(n<=1000000000) {
			int n1=n;
			int pv=1;
			while(n!=0) {
				int n2=n%10;
				ans=ans+n2*pv;
				n=n/10;
				pv=pv*2;
				
			}
			System.out.println(ans);
		}

	}

}
