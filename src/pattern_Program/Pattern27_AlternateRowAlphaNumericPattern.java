package pattern_Program;

import java.util.Scanner;

public class Pattern27_AlternateRowAlphaNumericPattern {
	public static void main(String[] args) {

/*	 Pattern	
		A  
		1  2  
		B  C  D  
		3  4  5  6  
*/		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();
		int n=1;
		char ch='A';
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				
				if(i%2 != 0) {
					System.out.print(ch+"  ");
					ch++;
				}
				else {
					System.out.print(n+"  ");
					n++;
				}
			}
			System.out.println();
		}
	}
}

