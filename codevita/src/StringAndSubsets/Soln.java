package StringAndSubsets;

import java.util.*;
public class Soln {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//int n = s.nextInt(); // no. of string in a group
		//int r = s.nextInt();
		String str = s.nextLine();
		int len = str.length();
		int temp = 0;
		 //total possible subsets for string of size n is n*(n+1)/2
		String arr[] = new String[(len*(len+1)/2)+1];
		
		//this loop maintains the starting character
		for(int i=0; i<len; i++) {
			
			//this loop adds the next character every iteration for the subset to form and add it to the array
			for(int j=i; j<len; j++) {
				arr[temp] = str.substring(i,j+1);
				temp++;
			}
		}
		
		//this loop print all the subsets formed from the string.
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
