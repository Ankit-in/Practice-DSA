package while_Pattern;

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int p=str.charAt(n);
        
        char ch=(char)(p);
        char y=ch;
        int i = 1;
        while(i<=n){
            int j=1;
            int z=y;
            while(j<=i){
                System.out.print((char)(z));
                j++;
                z++;
            }
            System.out.println();
            i++;
            y--;
        }
	}

}
