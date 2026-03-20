package pattern_Program;

import java.util.Scanner;

public class Pattern20_AlphabetNumberAlternate {
/*	
	A  1  B  2  
	C  3  D  4  
	E  5  F  6  
	G  7  H  8 
*/	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();
		char ch='A';
		int n=1;
		
		for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=num;j++) {
				if(j%2 != 0) { // odd column → letter
					System.out.print(ch+"  ");
					ch++;
				}else { // even column → number
					System.out.print(n+"  ");
					n++;
				}
				
			}
			System.out.println();
			}
		}

}
