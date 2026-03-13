package stringProblems;

public class ConvertGivenStringIntoUpperCase {

	public static void main(String[] args) {
		String str="kalasalingam";
	
		// Using Built In Method
		System.out.println(str.toUpperCase());
		
		//Without Built In Method
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				str1=str1+(char)(ch-32);
			}
			else {
				str1=str1+ch;
			}
		}
		System.out.println(str1);

	}

}
