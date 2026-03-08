package numberSeriesProblem;

import java.util.Scanner;

public class ToCheckArmstrongNumber {
//An Armstrong number (also known as a Narcissistic number) is a number that is equal to the sum of 
	//its own digits each raised to the power of the number of digits
	//153 is an Armstrong number because (1^3 + 5^3 + 3^3 = 153).
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number For Checking armstrong number :- ");
		int num=sc.nextInt();
		int count=0;
		int sum=0;
		int temp=num;
		
		while(temp>0) {
			count++;
			temp=temp/10;
		}
		temp=num;
		while(temp>0) {
			int rem=temp%10;
			int power = 1;
			for (int i = 0; i < count; i++) {
			    power = power * rem;
			}
			sum = sum + power;
			 temp = temp / 10;
		}
		if(sum==sum) {
			System.out.println("Given Number is Armstrong Number ");
		}
		else {
			System.out.println("Given Number is Not Armstrong Number ");
		}
		

	}

}
