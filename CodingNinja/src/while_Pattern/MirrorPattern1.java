package while_Pattern;

public class MirrorPattern1 {

	public static void main(String[] args) {
		int n =4;
		int i = 1;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print("*");
				j++;
			}
			j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
