package pattern_Program;

import java.util.Scanner;

public class Pattern01_squareWithStar {

	/* Pattern 
	 
	 * * * * 
	 * * * * 
	 * * * * 
	 * * * * 
	
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row and Cloumn Number for geeting square pattern");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
