package stringProblems;

public class FindLengthOfGivenString {

	public static void main(String[] args) {
		String str="Kalasalingam";
	//  Using inbuilt in method
		System.out.println("Length Of The Given String is : "+str.length());
		
	//  Without Using inbuilt in method
		int count=0;
		for(int i=0;i<str.length();i++) {count++;}
		System.out.println("Length Of The Given String is : "+count);
		
	//	Using for each loop or Enhanced loop or Advanced for loop  
		int count1=0;
		char[] ch=str.toCharArray();
		for(char i:ch) {count1++;}
		System.out.println("Length Of The Given String is : "+count1);
	}

}
