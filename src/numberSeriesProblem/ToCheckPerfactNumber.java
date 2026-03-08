package numberSeriesProblem;

import java.util.Scanner;

//A perfect number is a positive integer that is equal to the sum of its positive proper divisors, excluding the number itself

public class ToCheckPerfactNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number :- ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(num==sum) {
			System.out.println("Given Number is Perfact Number");
		}
		else {
			System.out.println("Given Number is Not Perfact Number");
		}
	}

}
