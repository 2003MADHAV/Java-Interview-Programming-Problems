package pattern_Program;

import java.util.Scanner;

public class Pattern25_RightAlignedMixedAlphabetPattern {

	public static void main(String[] args) {
/*		
 
		A B B B 
		  B C C 
		    C D 
		      D 
*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();

		for (int i = 1; i <= num; i++) {
		    // spaces
		    for (int s = 1; s < i; s++) {
		        System.out.print("  ");
		    }
		    char ch = (char)('A' + i - 1);

		    for (int j = 1; j <= num - i + 1; j++) {
		        System.out.print(ch + " ");
		        if (j == 1) {
		            ch = (char)(ch + 1);
		        }
		    }
		    System.out.println();
		}
		 
		}

}
