import java.util.LinkedHashSet;
import java.util.Set;

public class NonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "namburan";
		
		Set<Character> lhs=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
			if(lhs.contains(str.charAt(i))) {
				int count=0;
				count++;
				if(count>1) {
					lhs.add(str.charAt(i));
				}
			}else {
				lhs.add(str.charAt(i));
			}
		}

	}

}
