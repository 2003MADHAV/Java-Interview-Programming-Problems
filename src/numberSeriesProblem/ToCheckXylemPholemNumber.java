package numberSeriesProblem;

import java.util.Scanner;

// Find The Xylem or Phloem number exm:-21201 -->(2+1)=(1+2+0)===>Xylem Number
public class ToCheckXylemPholemNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num=sc.nextInt();
	
		int lastDigit=num%10;
		num=num/10;
		int sumOfDigitExceptFirstAndLast=0;
		while(num>9) {
			int rem=num%10;
			sumOfDigitExceptFirstAndLast=sumOfDigitExceptFirstAndLast+rem;
			num=num/10;
		}
		int sumOfFirstAndLast=num+lastDigit;
		if(sumOfFirstAndLast==sumOfDigitExceptFirstAndLast) {
			System.out.println("Entered Number is Xyelm Number");
		}
		else {
			System.out.println("Entered Number is Pholem Number");
		}

	}

}
