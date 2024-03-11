package NcR;
import java.util.Scanner;

public class fibonaci {
	public static boolean checkMember(int n) {
		if(n==0) {
			return true;
		}else {
			int n1=0;
			int n2=1;
			int n3=0;
			while(n3<=n || n3>n) {
				n3=n1+n2;
				n1=n2;
				n2=n3;
				System.out.println("0");
				if(n3==n) {
					System.out.println("*");
					return true;
				}
				if(n3>n) {
					System.out.println("9");
					return false;
				}
			}
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(checkMember(n));

	}

}
