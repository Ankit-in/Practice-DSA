import java.util.LinkedHashSet;
import java.util.Set;

public class FirstRepeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "namburan";
		Set<Character> lhs=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
			if(lhs.contains(str.charAt(i))) {
				System.out.println(str.charAt(i));
				break;
			}else {
				lhs.add(str.charAt(i));
			}
		}
		

	}

}
