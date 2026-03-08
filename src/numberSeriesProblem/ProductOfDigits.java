package numberSeriesProblem;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		int product=1;
		while(num>0) {
			int rem=num%10;
			product=product*rem;
			num=num/10;
			
		}
		System.out.println("The Product of Digits In given Number is : "+product);
	}

}
