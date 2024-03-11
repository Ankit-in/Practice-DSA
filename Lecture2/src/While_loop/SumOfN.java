package While_loop;

import java.util.Scanner;
public class SumOfN {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int i =1;
//		int sum=0;
//		
//		while(i<=n) {
//			sum=sum+i;
//			i++;
//		}
//		System.out.println(sum);
//		int i=2;
//		
//		while(i<10)
//		{
//			System.out.print(i);
//		    i*=2;
//		   }
		 Scanner s=new Scanner (System.in);
		    int n=s.nextInt();
		    boolean isprime=true;
		    if(n%2==0)
		        isprime=false;
		    int i=3;
		    while(isprime&&i<n)
		    {
		        isprime =! (n%i==0);
		        i+=2;
		    }
		    if(isprime)
		    {
		        System.out.println("Prime");
		    }
		    else
		    {
		        System.out.println("Composite");
		    }
		
	}

}
