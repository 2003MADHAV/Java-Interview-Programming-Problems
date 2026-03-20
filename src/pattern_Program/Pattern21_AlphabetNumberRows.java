package pattern_Program;

import java.util.Scanner;

public class Pattern21_AlphabetNumberRows {
/*	 pattern
 
	A  B  C  D  
	1  1  1  1  
	E  F  G  H  
	2  2  2  2  
	
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();
		char ch='A';
		int n=1;
		
		 for (int i = 1; i <= num; i++) {
	            if (i % 2 != 0) { // odd row → letters
	                for (int j = 1; j <= num; j++) {
	                    System.out.print(ch +"  ");
	                    ch++;
	                }
	            } else { // even row → numbers
	                for (int j = 1; j <= num; j++) {
	                    System.out.print(n + "  ");
	                }
	                n++; // move to next number for next numeric row
	            }
	            System.out.println();
	        }

		}

}
