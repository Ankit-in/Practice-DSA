package while_Pattern;

public class Triangle3 {

	public static void main(String[] args) {
		int n=4;
		int i=1;
		int count = 1;
		while(i<=4) {
			int j=1;
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
