package pattern_Program;

import java.util.Scanner;

public class Pattern13_InvertedNumberHalfPyramid {
/*	
	1    2    3    4    
	1    2    3    
	1    2    
	1    
*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();

		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i+1;j++) {
				
				System.out.print(j+"    ");		
			}
			System.out.println();
		}
		
	}

}
