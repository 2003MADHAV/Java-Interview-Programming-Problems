package stringProblems;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		String str="I am a Programmer";
		System.out.println("Before Removing Space in String :  "+str);
		System.out.println("After Removing Space in String  :  ");
		//Approach--> Using Split() -->Return type is String[]
		String str1="";
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			str1=str1+arr[i];
		}
		System.out.println(str1);

		//Approach --> Using CharAt()
		String str2="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch != ' ') {
				str2=str2+ch;
			}
		}
		System.out.println(str2);
	}

}
