package numberSeriesProblem;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Number :- ");
		
		int num=sc.nextInt();
		int reverseNum=0;
		while(num>0) {
			int rem=num%10;
			reverseNum=reverseNum*10+rem;
			num=num/10;
		}
		System.out.println("The Reverse Number of Given Number is "+reverseNum);
	}

}
