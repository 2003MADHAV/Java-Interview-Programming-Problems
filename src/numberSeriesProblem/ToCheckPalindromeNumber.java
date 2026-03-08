package numberSeriesProblem;

import java.util.Scanner;

public class ToCheckPalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number ");
		int num=sc.nextInt();
		int temp=num;
		int reverseNum=0;
		while(num>0) {
			int rem=num%10;
			reverseNum=reverseNum*10+rem;
			num=num/10;
		}
		if(temp==reverseNum) {
			System.out.println("Entred Number is Palindrom Number");
		}
		else {
			System.out.println("Entered Number is Not Palindrom");
		}
	}

}
