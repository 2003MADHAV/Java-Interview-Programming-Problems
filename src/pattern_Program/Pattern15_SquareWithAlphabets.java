package pattern_Program;

import java.util.Scanner;

public class Pattern15_SquareWithAlphabets {
/*
	A  B  C  D  
	E  F  G  H  
	I  J  K  L  
	M  N  O  P  
*/	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row and Cloumn Number : ");
		int num=sc.nextInt();
		
		char ch='A';
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {		
				System.out.print(ch++ +"  ");
			}
			System.out.println();
		}
	}

}
