package pattern_Program;

import java.util.Scanner;

public class Pattern22_NumberAlphabetCloumn {
	
	/*	Pattern
	 
	1	A	1	A
	2	B	2	B
	3	C	3	C
	4	D	4	D
*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();
		char ch='A';

		 for (int i = 1; i <= num; i++) {
	            // print row number + letter twice
	            System.out.print(i + "	" + ch + "	" + i + "	" + ch);
	            System.out.println();
	            ch++; 
	        }
		 
		}

}
