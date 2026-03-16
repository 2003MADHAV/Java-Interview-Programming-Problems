package stringProblems;

public class CheckingAStringIsPangram {

	public static void main(String[] args) {
		/*
		A pangram is a sentence that contains every letter of the English alphabet at least once. 
		For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram because 
		it includes all 26 letters from 'a' to 'z'.
		*/
		String s="The quick brown fox jumps over the lazy dog";
		
		s=s.toLowerCase();
		
		boolean flag = isPangram(s);
		if(flag) {
			System.out.println("It is Pangram String");
		}
		else {
			System.out.println("It is Not Pangram String");
		}
		
	}
	public static boolean isPangram(String s) {
		
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
