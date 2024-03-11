
public class deleteDublicate {
	public static String deleteDublicate(String str) {
        String str1="";
        str1 += str.charAt(0);
        int j=0;
        while(j<str1.length()) {
        	for(int i=1;i<str.length();i++) {
            	if(str.charAt(i)!=str1.charAt(j)) {
            		str1 += str.charAt(i);
            		j++;
            	}
            }
        	break;
        }
        return str1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabbbcc";
		System.out.println(deleteDublicate(str));

	}

}
