package stringProblems;

import java.util.Arrays;

public class ReverseTheGivenSentence {
	public static void main(String[] args) {
		String s="Cricket is Popular Sports";
		String[] str=s.split(" ");
		String s1="";
		
		//Approach---> 1
		for(int i=str.length-1;i>=0;i--) {
			s1=s1+str[i]+" ";
		}
		System.out.println(s1);
		
		//Approach---> 2
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
		}
		
		//Approach---> 3 Using temp variable
		for(int i=0;i<str.length/2;i++) {
			String temp=str[i];
			str[i]=str[str.length-1-i];
			str[str.length-1-i]=temp;
		}
		System.out.println();
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
	}
}
