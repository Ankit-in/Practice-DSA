package test1;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>0;j--) {
				if(j==i) {
					System.out.print("*");
					continue;
				}
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
