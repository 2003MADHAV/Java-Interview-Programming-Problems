package numberSeriesProblem;

import java.util.Scanner;

public class PrintFirstDigitsInGivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num=sc.nextInt();
		while(num>9) {
			num=num/10;
		}
		System.out.println("The First Digit in Given Number is : "+num);
	}

}
