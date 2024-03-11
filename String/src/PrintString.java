import java.util.Scanner;
public class PrintString {
	public static int printString(String str) {
		int c=1;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==' ') {
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str = s.nextLine();
		printString(str);

	}

}
