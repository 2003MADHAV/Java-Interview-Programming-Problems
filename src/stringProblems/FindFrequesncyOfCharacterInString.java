package stringProblems;

public class FindFrequesncyOfCharacterInString {

	public static void main(String[] args) {
		String str="Technologies";
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		boolean[] b=new boolean[ch.length];
		for(int i=0;i<ch.length;i++) {
			int count=1;
			if(b[i]==false) {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
						b[j]=true;
					}
				}
				System.out.println(ch[i]+" is Appear : "+count);
			}
		}

	}

}
