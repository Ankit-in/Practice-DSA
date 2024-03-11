package run;
import java.util.Scanner;
public class Squeroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();  //4 //18
        
        int i = 0;    //0
        while(i*i<=N) //0*0,1*1,2*2,3*3,4*4,5*5
        {
            i = i + 1;
        }
        i = i - 1;  //i=3-1 //5-1
        System.out.println(i);
	}

}
