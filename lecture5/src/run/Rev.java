package run;
import java.util.Scanner;
public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();  //1234
        int rev=0;          //0
        if(n<=100000000){
        	int n1=n;
            while(n!=0){    //1234
            	int n2=n%10;    //4
                rev=rev*10+n2;    //4
                n=n/10;           //123
            }
            System.out.println(rev);   
        }
	}

}
