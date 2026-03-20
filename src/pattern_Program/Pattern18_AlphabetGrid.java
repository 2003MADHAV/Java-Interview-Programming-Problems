package pattern_Program;

import java.util.Scanner;

public class Pattern18_AlphabetGrid {
/*	
	A  B  C  D  
	A  B  C  D  
	A  B  C  D  
	A  B  C  D
*/	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			char ch='A';
			for(int j=1;j<=num;j++){
				System.out.print(ch+"  ");	
				ch++;
			}
			System.out.println();
			
		}
	}

}
