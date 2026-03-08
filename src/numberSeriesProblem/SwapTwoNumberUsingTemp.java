package numberSeriesProblem;

import java.util.Scanner;

public class SwapTwoNumberUsingTemp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of a :- ");
		int a=sc.nextInt();
		System.out.println("Enter Value of b :- ");
		int b=sc.nextInt();
		System.out.println("Before Swaping Of Value a and b is : "+a+"  "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swaping Of Value a and b is : "+a+"  "+b);

	}

}
