package stringProblems;

import java.util.Scanner;

public class ToCheckGivenStringPalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String For Checking Palindrom or Not : ");
		String str=sc.nextLine();
		String revstr="";
		for(int i=str.length()-1;i>=0;i--) {
			revstr=revstr+str.charAt(i);
		}
		System.out.println(revstr);
		if(str.equals(revstr)) {
			System.out.println("Entered String is Palindrome String");
		}
		else {
			System.out.println("Entered String is Not Palindrome String");
		}

	}

}
