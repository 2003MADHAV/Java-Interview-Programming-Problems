package numberSeriesProblem;

import java.util.Scanner;

public class SumOfAllDigitsInGivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number :  ");
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of All Digits in Given Number is : "+sum);
	}

}
