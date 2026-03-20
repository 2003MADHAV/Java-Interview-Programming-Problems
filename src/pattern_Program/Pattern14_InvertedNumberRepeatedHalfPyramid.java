package pattern_Program;

import java.util.Scanner;

public class Pattern14_InvertedNumberRepeatedHalfPyramid {
/*	
	1    1    1    1    
	2    2    2    
	3    3    
	4    
*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();
		int a=1;
		for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=num-i+1;j++) {
				System.out.print(a+"    ");	
				
			}
			a++;
			System.out.println();
		}
	}

}
