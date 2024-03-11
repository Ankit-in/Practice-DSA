import java.util.Scanner;
public class Reverse {
//	public static String printReverse(String str) {
//		String reverseString ="";
//		for(int i=0;i<str.length();i++) {
//			reverseString = str.charAt(i) + reverseString;
//			
//		}
//		return reverseString;
//	}
	public static int occur(String str) {
		String str2="";
		int count=1;
		for(int i=0;i<str.length()-1;i++) {
			for(int j=i+1;j<str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					str2 += str.charAt(i);
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		int reverseStrin = occur(str);
		System.out.println(reverseStrin);
	}

}
