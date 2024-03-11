package continuos;
//import java.util.Scanner;
public class Cont_use {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Scanner s = new Scanner(System.in);
		for(int i=1;i<=10;i++) {
			if(i==5) {
				//break;  if we use break then then for loop get terminated
				continue;  //it will terminate the loop but for loop again repeated
 			}
			System.out.println(i);
		}
		
		int k=1;
		while(k<=10) {
			if(k==5) {
				k++;
				continue;
			}
			System.out.println(k);
			k++;
		}
		

	}

}
