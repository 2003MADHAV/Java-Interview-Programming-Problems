package numberSeriesProblem;

import java.util.Scanner;

public class SumAllDigitExceptFirstAndLast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num=sc.nextInt();
		num=num/10;
		int sum=0;
		while(num>9) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("The Sum of All Digits Except First and Last Digits is : "+sum);
	}
}
