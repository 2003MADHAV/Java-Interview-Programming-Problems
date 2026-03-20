package pattern_Program;

import java.util.Scanner;

public class Pattern03_TopLeftPattern {
/* Pattern
 
	*  *  *  *  
	*  
	*  
	* 
	
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i==1 || j==1) {
					System.out.print("*  ");
				}
			}
			System.out.println();
		}

	}

}
