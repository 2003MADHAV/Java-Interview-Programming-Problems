package stringProblems;

import java.util.Scanner;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String in Senetence:  ");
		String str=sc.nextLine();
		String[] words =str.split(" ");
		
		//Approach---1 using built in methods
		System.out.println("Number of Words In Given String are : "+words.length);
		
		//Approach ---2(Without using built in methods
		int count=0;
		for(int i=0;i<words.length;i++) {
			count++;
		}
		System.out.println("Number of Words In Given String are : "+count);
	}

}
