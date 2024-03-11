package while_Pattern;

public class Triangle4 {

	public static void main(String[] args) {
		int n=4;
		int i=1;
		while(i<=n) {
			int j=1;
			int count=i;
//			System.out.println(count);
			while(j<=i) {
				System.out.print(count);
				count++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
