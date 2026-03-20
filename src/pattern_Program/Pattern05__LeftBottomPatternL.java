package pattern_Program;

import java.util.Scanner;

public class Pattern05__LeftBottomPatternL {

	/* Pattern
		 *  
		 *  
		 *  
*  *  *  * 

*/ 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i==num || j==num) {
					System.out.print("*  ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}
}
