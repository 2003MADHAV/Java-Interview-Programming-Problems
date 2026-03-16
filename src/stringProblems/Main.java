package stringProblems;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog";
		s=s.toLowerCase();
		
		boolean flag=isPanagram(s);
		if(flag) {
			System.out.println("panagram");
		}
		else {
			System.out.println("not panagram");
		}
	}
	public static boolean isPanagram(String s) {
		
		if(s.length()>=26) {
			for(char ch='a';ch<='z';ch++) {
				if(s.indexOf(ch)<0) {
					return false;
				}
			}
		}
		else {
			return false;
		}
		
		return true;
	}
}
