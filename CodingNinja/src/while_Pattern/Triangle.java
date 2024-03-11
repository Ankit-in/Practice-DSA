package while_Pattern;
import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
//		int n = 4;
//		int i =1;
//		while(i<=n) {
//			int j = 1;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		int n=3;
		int i=1;
		
		while(i<=n) {
			int a=i;
			int j=1;
			while(j<=i) {
				System.out.print(a);
				j++;
				a++;
			}
			System.out.println();
			i++;
		}
		

	}

}
