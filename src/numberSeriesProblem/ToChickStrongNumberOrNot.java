package numberSeriesProblem;

import java.util.Scanner;
//A strong number is a number whose sum of the factorials of its digits equals the number itself.
public class ToChickStrongNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : -");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			int fact=1;
			//for(int i=rem;i>=1;i--) 
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		
		if(sum==temp) {
			System.out.println("Given Number is Strong Number");
		}
		else{
			System.out.println("Given Number is Not Strong Number");
		}

	}

}
