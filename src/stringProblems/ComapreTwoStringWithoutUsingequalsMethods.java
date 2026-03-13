package stringProblems;

public class ComapreTwoStringWithoutUsingequalsMethods {

	public static void main(String[] args) {
		String s1="Kalasalingam".toLowerCase();
		String s2="kalasalingam".toLowerCase();
		
		//Approach --->1 
		boolean b=true;
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i) != s2.charAt(i)) {
					b=false;
					break;
				}
			}
		}
		else {
			b=false;
		}
		System.out.println(b ? "Strings are equal" : "Strings are not equal");
		
		// Approach --->2
		if (s1.compareTo(s2) == 0) {
		    System.out.println("Strings are equal");
		} else {
		    System.out.println("Strings are not equal");
		}
		
		//Approach -->3
		

	}

}
