
public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Hello");
		int last=str.length()-1;
		char[] chararr=str.toCharArray();
		for(int i=0;i<str.length()/2;i++) {
			char temp=chararr[last];
			chararr[last]=chararr[i];
			chararr[i]=temp;
			last--;
		}
		
	}

}