package break_lop;
import java.util.Scanner;
public class Bconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>i) {
					break;
				}
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
