package numberSeriesProblem;

import java.util.Scanner;

public class CheckSpyNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number To Check Spy Number :- ");
		int num=sc.nextInt();
		int sum=0;
		int product=1;
		
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			product=product*rem;
			num=num/10;
		}
		if(sum==product) {
			System.out.println("Entered Number is Spy Number");
		}
		else {
			System.out.println("Entered Number is Not Spy Number");
		}

		
	}

}
