
public class Reversestringword {

	public static void main(String[] args) {
		String str= "i'm good";
		//System.out.println(reverseString(str));
		System.out.println(reverseString(str));
		

	}

	public static char[] reverseString(String str) {
		// TODO Auto-generated method stub
		
		char[] str1=str.toCharArray();
		char[] str2=new char[str1.length];
//		int last=str1.length-1;
//		//int length=str1.length;
//		int i=0;
		int lc=0;
//		int prev=str1.length-1;
//		while(last!=0) {
//			
//			if(str1[last]==' ') {
//				for(int j=last+1;j<=prev;j++) {
//					str2[i]=str1[j];
//					i++;
//				}
//				str2[i]=' ';
//				i++;
//				prev=last-1;
//				
//				
//			}
//			last--;
//		}
//		
//		System.out.println(i);
//		while(str1[lc]!=' ') {
//			if(str1[lc]!=' ') {
//				str2[i]=str1[lc];
//				lc++;
//				i++;
//			}
//		}
		int last=str1.length-1;
		int i=0;
		int prev=str1.length-1;
		int wordlen=0;
		while(last!=0) {
			if(str1[last]==' ') {
				for(int j=last+1;j<=prev;j++) {
					if(str1[i]==' ') {
						str2[i]=' ';
						i++;
					}
					str2[i]=str1[j];
					i++;
				}
				prev=last-1;
			}
			last--;
		}
		while(str1[lc]!=' ') {
			if(str1[lc]!=' ') {
				str2[i]=str1[lc];
				lc++;
				i++;
			}
		}
		
		
		return str2;
	}

}
