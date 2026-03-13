package stringProblems;

public class ConvertChracterArrayIntoString {

	public static void main(String[] args) {
		
		char[] ch= {'M','a','d','h','v'};
		
		/*
          Method 1: Using String Constructor
          Here we pass the character array to the String constructor.
          Java internally converts the char[] into a String object.
         */
		String str2=new String(ch);
		System.out.println(new String(ch));      // direct conversion
		System.out.println(str2);				 // using variable
		
		 /*
          Method 2: Using for loop
          Start with an empty string and append each character
          one by one using string concatenation.
         */
		String str="";
		for(int i=0;i<ch.length;i++) {
			str=str+ch[i];
		}
		System.out.println(str);
		
		 /*
          Method 3: Using Enhanced for loop (for-each loop)
          Iterate through each character in the array
          and append it to the string variable.
         */
		String str1="";
		for(char c:ch) {
			str1=str1+c;
		}
		System.out.println(str1);
	}
}
