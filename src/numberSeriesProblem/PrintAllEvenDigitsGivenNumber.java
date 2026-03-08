package numberSeriesProblem;

import java.util.Scanner;

public class PrintAllEvenDigitsGivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num=sc.nextInt();
		System.out.println("The Even Digits In Given Number is :");
		while(num>0) {
			int rem=num%10;
			if(num%2==0) {

				System.out.println(rem);
			}
			num=num/10;
		}
	}

}
