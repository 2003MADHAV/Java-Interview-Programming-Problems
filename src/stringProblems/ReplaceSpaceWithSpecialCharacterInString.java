package stringProblems;

public class ReplaceSpaceWithSpecialCharacterInString {

	public static void main(String[] args) {
		String str="I am a Programmer";
		
		//Approach 1 Using replace()
		System.out.println(str.replace(' ', '#'));
		
		//Approach -2
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch ==' ') {
				ch='@';
			}
			str1=str1+ch;
		}
		System.out.println(str1);
		
		//Approach -3
		String str2="";
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			str2=str2+arr[i];
			if(i<arr.length-1) {
				str2 = str2 + "$";  // special character
			}
		}
		System.out.println(str2);		
	}
}
