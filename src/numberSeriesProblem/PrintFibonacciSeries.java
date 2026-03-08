package numberSeriesProblem;

import java.util.Scanner;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number For Geting fibonacci series :- ");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println("The Fibonacci Series of Given Number are");
		System.out.print(a+ " "+b+" ");
		for(int i=3;i<=num;i++) {
			int sum=a+b;
			System.out.print(sum+"  ");
			a=b;
			b=sum;
		}

	}

}
