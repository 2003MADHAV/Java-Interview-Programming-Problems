package numberSeriesProblem;

import java.util.Scanner;

// A neon number is defined as a number where the sum of the digits of its square equals the number itself

public class ToCheckNeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : -");
		int num=sc.nextInt();
		int square=num*num;
		int sum=0;
		
		while(square>0) {
			int rem=square%10;
			sum=sum+rem;
			square=square/10;
			
		}
		if(num==sum) {
			System.out.println("Entered Number is Neon Number");
		}
		else {
			System.out.println("Entered Number is Not Neon Number");
		}

	}

}
