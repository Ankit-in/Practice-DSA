import java.util.List;
import java.util.Stack;
public class Validprantheses {
	public static boolean isValid(String str) {
		Stack<Character>  stack = new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='(' || ch=='{'|| ch=='[') {
				stack.push(ch);
			}else if(ch==')' ) {
				if(stack.peek()=='(') {
					stack.pop();
				}else {
					return false;
				}
			}else if(ch=='}') {
				if(stack.peek()=='{') {
					stack.pop();
				}else {
					return false;
				}
			}else if(ch==']') {
				if(stack.peek()=='[') {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		if(stack.size()==0) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "[()]{}{[()()]()}";
		boolean Result=isValid(str);
		System.out.println(Result);

	}

}
