package pattern_Program;

import java.util.Scanner;

public class Pattern16_SquareWithIncremeantedBy2 {
/*	
	2	4	6	8	
	10	12	14	16	
	18	20	22	24	
	26	28	30	32	
*/	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();
		int a=2;

		for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=num;j++) {
				
				System.out.print(a+"	");	
				a=a+2;
			}
			System.out.println();
		}
		
	}

}
