
public class Stringliteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abc";
		String str2="xyz";
		
		str1=str1+str2;
		//System.out.println(str1); //now length
		str2=str1.substring(0, str1.length()-str2.length());
		
		System.out.println(str2);
		str1=str1.substring(str2.length(), str1.length());
		System.out.println(str1);
	}

}