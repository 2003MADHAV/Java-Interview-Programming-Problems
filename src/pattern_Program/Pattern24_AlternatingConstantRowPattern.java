package pattern_Program;

import java.util.Scanner;

public class Pattern24_AlternatingConstantRowPattern {
// Asked in MNC  Company
/*
	A  A  A  A  
	1  1  1  
	B  B  
	2 
*/	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row and Cloumn Number : ");
		int num=sc.nextInt();
		char ch='A';
		 int n=1;
		 for (int i = num; i >= 1; i--) { 
			
			 if(i%2 !=0) {
				 for(int j=1;j<=i;j++) {
					 System.out.print(n+"  ");
					 
				 }
				 n++;
				 
			 }else {
				 for(int j=1;j<=i;j++) {
					 System.out.print(ch+"  ");
				 }
				 ch++;
			 }
			 System.out.println();
	           
	        }
		 
		}
}
