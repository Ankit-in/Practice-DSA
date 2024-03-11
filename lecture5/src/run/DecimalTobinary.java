package run;
import java.util.Scanner;
public class DecimalTobinary {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int pv=1;
		long ans=0;
		if(n<=100000) {
			while(n!=0) {
				int rem=n%2;
				ans=ans+rem*pv;
				n=n/2;
				pv=pv*10;
			}
			System.out.println(ans);
		}
	}

}
