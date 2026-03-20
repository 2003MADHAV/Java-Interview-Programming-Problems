package pattern_Program;

import java.util.Scanner;

public class Pattern07_FromRightDiagonalLine {
	/* pattern
	 
	      *  
      *     
   *        
*           
            
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();
		
		for(int i=num;i>=0;i--) {
			for(int j=1;j<=num;j++) {
				if(i==j) {
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
