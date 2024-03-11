package while_Pattern;
import java.util.Scanner;
public class hand_leg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1=(n+1)/2;
		int n2=n1-1;
		int i=1;
		while(i<=n1) {
			int j=1;
			while(j<=i-1) {
				System.out.print(" ");
				j++;
			}
			int p=1;
			while(p<=1) {
				System.out.print(i);
				p++;
			}
			System.out.println();
			i++;
		}
		int q=1;
		int z=n2;
		while(q<=(2*z)-1) {
			System.out.print("1");
			q++;
		}
		System.out.println();
		i--;
	}

}
