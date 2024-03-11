package while_Pattern;

import java.util.Scanner;
public class sum_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		int sum;
		int j;
		while(i<=n) {
			j=1;
			sum=0;
			while(j<=i) {
				System.out.print(j);
				sum=sum+j;
				j++;
				if(j<=i) {
					System.out.print("+");
				}
			}
			System.out.print("=" + sum);
			
			System.out.println();
			i++;
		}

	}

}
