
public class Maxoccchar {

	public static void main(String[] args) {
		String str="aaabbbcccc";
		int count1=0;
		int count2=0;
		char ch1=0;
		//System.out.println(ch1);
		char ch2='0';
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count2++;
					ch1=str.charAt(i);
				}
			}if(count1<count2) {
				count1=count2;
				ch2=ch1;
				ch1='0';
				count2=0;
			}else {
				count2=0;
				ch1='0';
			}
		}if(count1!=0) {
			System.out.println(ch2);
		}else {
			return;
		}
		

	}

}
