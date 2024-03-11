package NcR;
import java.util.Scanner;

public class Isprimee {
	public static boolean isPrime(int n) {
		int d=2;
		while(d<n) {
			if(n%d==0) {
				return false;
			}
			d++;
		}
		return true;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean checkprime=isPrime(n);
		System.out.println(checkprime);

	}

}
