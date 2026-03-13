package stringProblems;

public class ValidatePassword {

	public static void main(String[] args) {
		String password="Admin&123";
		
		int upperCase=0,lowerCase=0,specialChar=0,space=0;
		
		if(password.length()>=8 && password.length()<=50) {
			
			for(int i=0;i<password.length();i++) {
				char ch=password.charAt(i);
				if(ch>='A' && ch<='Z') {
					upperCase++;
				}else if(ch>='a' && ch<='z') {
					lowerCase++;
				}else if(ch==' ') {
					space++;
				}else {
					specialChar++;
				}	
			}
			if(upperCase>0 && lowerCase>0 && specialChar>0 && space==0) {
				System.out.println("Password Is Valid");
			}else {
				System.out.println("Password is Invalid");
			}
		}else {
			System.out.println("Password is Invalid");
		}

	}

}
