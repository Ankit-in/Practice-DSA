package while_Pattern;

import java.util.Scanner;
public class Halfdimond {

    public static void main(String[] args) {
        // Write your code here
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();

        if(n==0){
            System.out.println("*");
            System.out.print("*");
            return;
        }

        int i=1;
        while(i<=n+1){

            int star=1;
            while(star==1){
                System.out.print("*");
                star=star+1;
            }

            int increment = 1;
            while(increment<=i-1){
                System.out.print(increment);
                increment= increment+1;
            }

            int decrement =1;
            int val=i-2;
            while(decrement<=i-2){
                System.out. print(val);
                decrement =decrement+1;
                val = val -1;
            }
            if(i>1){
                System.out.print("*");
            }

            System.out.println();
            i=i+1;

        }
            i=1;
            while(i<=n){

                int star2=1;
                while(star2==1){
                    System.out.print("*");
                    star2=star2+1;
                }

                int increment1 = 1;
                while(increment1<=n-i){
                    System.out.print(increment1);
                    increment1= increment1+1;
                }


                int decrement1 =1;
                int val1=n-i-1;
                while(decrement1<=n-i-1){
                    System.out.print(val1);
                    decrement1 =decrement1+1;
                    val1 = val1 -1;
                }

                if(i!=n){
                    System.out.print("*");
                }
                System.out.println();
                i=i+1;
            }

        }



    }