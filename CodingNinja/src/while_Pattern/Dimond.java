package while_Pattern;

import java.util.Scanner;
public class Dimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		int n1=(n+1)/2;
		int n2=n1-1;
		int i=1;
		while(i<=n1) {
			int j=1;
			while(j<=n1 - i) {
				System.out.print(" ");
				j++;
			}
			int z =1;
			while(z<=(2*i)- 1) {
				System.out.print("*");
				z++;
			}
			System.out.println();
			i++;
			
		}
		int p=n2;
		while(p>n2-n2) {
			int q=1;
			while(q<=(n2-p)+1) {
				System.out.print(" ");
				q++;
			}
			int r=1;
			while(r<=(2*p)-1) {
				System.out.print("*");
				r++;
			}
			System.out.println();
			p--;
		}

	}

}
