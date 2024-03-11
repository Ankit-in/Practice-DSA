package NcR;
import java.util.Scanner;
public class NcRf {
	public static int factorial(int n) {
		int a=1;
		for(int i=1;i<=n;i++) {
			a=a*i;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		
		int num=factorial(n);
		int num2=factorial(r);
		int num3=factorial(n - r);
		
		int ans=(num/(num2*num3));
		System.out.println(ans);

	}

}
