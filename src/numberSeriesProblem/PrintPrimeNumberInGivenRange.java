package numberSeriesProblem;

import java.util.Scanner;

public class PrintPrimeNumberInGivenRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Range of Number For geting Prime Number in Range");
		System.out.println("Enter Statrting Point of Number :-  ");
		int num1=sc.nextInt();
		System.out.println("Enter Ending Point of Number :-  ");
		int num2=sc.nextInt();
		System.out.println("The Prime Number In given Range are :  ");
		for(int i=num1;i<=num2;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}
	}

}
