package stringProblems;

public class CountDigitsInString {

	public static void main(String[] args) {
		String str="Ohm2003";
		int countDigits=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch>='0' && ch<='9') {
				countDigits++;
			}
		}
		System.out.println("Count Of the Digits In Given String is  : "+countDigits);
	}

}
