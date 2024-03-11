
public class validparanthasis {
	
	public static void main(String[] args) {
		String str="[()]{}{[()()]()}";
		char[] str1=new char[str.length()];
		
		for(int i=0;i<str.length() && i<str1.length;i++) {
			char ch=str.charAt(i);
			if(ch=='(' || ch=='{'||ch=='[') {
				str1[i]=ch;
			}else if(str.charAt(i)==')') {
				if(str1[i]=='(') {
					
				}
			}
		}
	}
}
