package numberSeriesProblem;

import java.util.Scanner;

public class RemoveLastDigitInGivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=sc.nextInt();
		int num1=num/10;
		System.out.print("After Removeing Last Digit in Given Number is : ");
		System.out.println(num1);
		

	}

}
