package numberSeriesProblem;

import java.util.Scanner;

public class SumOfAllEvenDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				sum=sum+rem;
			}
			num=num/10;
		}
		System.out.println("The Sum of Even Digits in Given Number is : "+sum);
	}

}
