package numberSeriesProblem;

import java.util.Scanner;

public class SwapingTwoNumberWithoutTemp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of a :- ");
		int a=sc.nextInt();
		System.out.println("Enter Value of b :- ");
		int b=sc.nextInt();
		System.out.println("Before Swaping Of Value a and b is : "+a+"  "+b);
	/*	//using Addition and Subtraction
		a=a+b;
		b=a-b;
		a=a-b;
		*/
		//using multiplication and Division
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("Before Swaping Of Value a and b is : "+a+"  "+b);
	}

}
