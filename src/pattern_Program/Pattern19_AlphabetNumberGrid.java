package pattern_Program;

import java.util.Scanner;

public class Pattern19_AlphabetNumberGrid {
/*	
	A  B  C  D  
	1  2  3  4  
	A  B  C  D  
	1  2  3  4  
*/	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%2 !=0) {
				char ch='A';
				for(int j=1;j<=num;j++) {
					System.out.print(ch+"  ");
					ch++;
				}
			}
			else {
				for(int j=1;j<=num;j++) {
					System.out.print(j+"  ");
				}
			}
			System.out.println();
		}
	}

}
