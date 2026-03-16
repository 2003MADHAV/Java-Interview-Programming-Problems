package stringProblems;

import java.util.Arrays;

public class ToCheckAnagramString {

	public static void main(String[] args) {
		
		// An anagram is when two strings contain the same characters with identical frequencies,
		//  but possibly in a different order. For example, "listen" and "silent" are anagrams
		
		String s1="Listen";
		String s2="Silent";
		
			// Step: 1 --> Check if lengths are equal
		if(s1.length()==s2.length()) {
			
			// Step: 2 --> Convert both strings to lowercase
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			
			// Step: 3 --> Convert strings to char arrays
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			
			// step : 4  --> Sort both arrays
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			//Step : 5 --> Convert Character Array into String 
			String str1=new String(ch1);
			String str2=new String(ch2);
			
			// step : 6 --> Compare the sorted strings 
			if(str1.equals(str2)) {
				System.out.println("It is Anagram String");
			}
			else {
				System.out.println("It is Not Anagram String");
			}
		}
		else {
			System.out.println("It is not Anagram String");
		}
	}

}
