
public class RemoveDublicate {

	public static void main(String[] args) {
		String str="abcddef";
//		String str1="";
//		str1=str1+str.charAt(0);
//		int i=0;
//		while(i<str1.length()) {
//			int index=0;
//			for(int j=i+1;j<str.length();j++) {
//				if(str1.charAt(i)!=str.charAt(j)) {
//					str1 += str.charAt(i);
//					i++;
//				}
//			}break;
//		}
//		System.out.println(str1);
		char[] str1=str.toCharArray();
		int curr = 0;
		int next=1;
		while(next<str1.length) {
			if(str1[curr]!=str1[next]) {
				str1[++curr]=str1[next];
			}
			next++;
		}
		
		for (int i = 0; i <= curr; i++) {
            System.out.print(str1[i]);
        }
	}
}
