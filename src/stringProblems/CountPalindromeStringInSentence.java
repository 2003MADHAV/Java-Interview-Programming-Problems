package stringProblems;

public class CountPalindromeStringInSentence {

	public static void main(String[] args) {
		String s="madam the racecar is not level";
		int count=0;
		String[] words=s.split(" ");
		for(int i=0;i<words.length;i++) {
			String str=words[i];
			String revStr="";
			for(int j=str.length()-1;j>=0;j--) {
				revStr=revStr+str.charAt(j);
			}
			if(str.equals(revStr)) {
				count++;
			}
		}
		System.out.println("The Count Of Palindrome Words in Given Sentence  : "+count);
	}

}
