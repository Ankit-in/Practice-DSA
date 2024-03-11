
public class palindirom {
	public static boolean palindrome(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			str1 += str.charAt(i);
		}
		String str2="";
		for(int i=str.length()-1; i>=0;i--) {
			str2 += str.charAt(i);
		}
		if(str1==str2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
