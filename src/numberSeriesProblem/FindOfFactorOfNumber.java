package numberSeriesProblem;

import java.util.Scanner;

public class FindOfFactorOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number For Finding It's Facotrs :- ");
		int num=sc.nextInt();
		System.out.println("Factors Of Given Number is :- ");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}

	}

}
