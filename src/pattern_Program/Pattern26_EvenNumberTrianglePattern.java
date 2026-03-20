package pattern_Program;

import java.util.Scanner;

public class Pattern26_EvenNumberTrianglePattern {
/*	
	2 
	4 6 
	8 10 12 
	14 16 18 20 
*/	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();
		int n=2;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n=n+2;
			}
			System.out.println();
		}
	}

}
