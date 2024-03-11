package lecture3;

public class ScopeOfVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =10;
		System.out.println(i);
		if(i==10) {
			int n=23;
			System.out.println(n);
		}
		//System.out.println(n);
	}

}
