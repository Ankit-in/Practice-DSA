package run;
import java.util.*;
public class SumChoice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int c=s.nextInt();
        switch(c){
        case 1:
        	int sum=0;
        	for(int i=1;i<=n;i++) {
        		sum=sum+i;
        	}
        	System.out.print(sum);
            break;
        case 2:
        	int pro=1;
            for(int j=1;j<=n;j++){
                pro=pro*j;
            }
            System.out.print(pro);
            break;
        default :
            System.out.print(-1);
            break;
    }

}
	
}
