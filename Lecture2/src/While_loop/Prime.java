package While_loop;

import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int i = 1;
		
		while(i<=(n-1)) {
			if(n%i == 0) {
				System.out.println(i);
			}
			i=i+1;
		}
		

	}

}
