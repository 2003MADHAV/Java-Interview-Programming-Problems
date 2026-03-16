package stringProblems;

public class ReverseEachWordInGivenSentence {

	public static void main(String[] args) {
		String s="Kalasalingam Academy Of Research";
		String s2="";
		String[] words=s.split(" ");
		
		for(int i=0;i<words.length;i++) {
			String s1=words[i];
			String rev="";
			for(int j=s1.length()-1;j>=0;j--) {
				rev=rev+s1.charAt(j);
			}
			s2=s2+rev+" ";
		}
		System.out.println(s2);
	}

}
