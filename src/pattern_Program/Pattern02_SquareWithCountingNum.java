package pattern_Program;

import java.util.Scanner;

public class Pattern02_SquareWithCountingNum {
	/* Pattern
	1	2	3	4	
	5	6	7	8	
	9	10	11	12	
	13	14	15	16
	
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of row and Cloumn :");
		int num=sc.nextInt();
		int n=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				
				System.out.print(n++ +"	");
			}
			System.out.println();
		}
	}

}
