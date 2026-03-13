package stringProblems;

public class CountVowelAndConsonantsCharacter {

	public static void main(String[] args) {
		String str="Kalasalingam&8";
		str=str.toLowerCase();
		int voewlCount=0;
		int ConsonantsCount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					voewlCount++;
				}
				else {
					ConsonantsCount++;
				}
			}
		}
		System.out.println("Count of Vowel In Given String is  "+voewlCount);
		System.out.println("Count of Consonants In Given String is  "+ConsonantsCount);

	}

}
