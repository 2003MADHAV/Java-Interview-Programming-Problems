package stringProblems;

public class PrintMaximumLengthStringInGivenString {

	public static void main(String[] args) {
		String s="Learning String Programming in Java";
		String[] words=s.split(" ");
		String largestWord=words[0];
		
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>largestWord.length()) {
				largestWord=words[i];
			}
		}
		
		System.out.println("Maximum length String In Given Sentence is :  "+largestWord);
	}

}
