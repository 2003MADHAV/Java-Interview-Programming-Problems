package pattern_Program;

import java.util.Scanner;

public class Pattern17_SquareWithRowNumberIncrmentBy1 {
/*	
	1  1  1  1  
	2  2  2  2  
	3  3  3  3  
	4  4  4  4  
*/	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();
		int a=1;

		for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=num;j++) {
				
				System.out.print(a+"  ");	
				
			}
			a++;
			System.out.println();
		}
		
	}

}
