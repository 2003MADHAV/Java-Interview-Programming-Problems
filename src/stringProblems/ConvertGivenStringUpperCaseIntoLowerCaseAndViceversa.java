package stringProblems;

public class ConvertGivenStringUpperCaseIntoLowerCaseAndViceversa {

	public static void main(String[] args) {
		String str="KaLaSaLiNgAm";
		System.out.println("Before Converting Irrespectvie Case  : "+str);
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				str1=str1+(char)(ch+32);
			}
			else if(ch>='a' && ch<='z') {
				str1=str1+(char)(ch-32);
			}
			else {
				str1=str1+ch;
			}
		}
		System.out.println("After Converting Irrespectvie Case  : "+str1);

	}

}
