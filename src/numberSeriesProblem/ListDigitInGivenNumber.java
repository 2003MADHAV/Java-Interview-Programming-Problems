package numberSeriesProblem;

import java.util.Scanner;

public class ListDigitInGivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number :-");
		int num=sc.nextInt();
		int lastDigit=num%10;
		System.out.println("Last Digit in Given Number is : "+lastDigit);

	}

}
