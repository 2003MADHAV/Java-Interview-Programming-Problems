package numberSeriesProblem;

import java.util.Scanner;

public class SumOfFirstAndLastDigitsGivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num=sc.nextInt();
		int lastDigit=num%10;
		num=num/10;
		int sum=0;
		
		while(num>9) {
			num=num/10;
		}
		 sum=num+lastDigit;
		System.out.println("The Sum of First and Last Digit In given Number is : "+sum);

	}

}
