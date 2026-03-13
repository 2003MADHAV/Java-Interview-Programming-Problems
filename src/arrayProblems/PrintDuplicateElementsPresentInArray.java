package arrayProblems;

public class PrintDuplicateElementsPresentInArray {

	public static void main(String[] args) {

		int[] arr={1, 2, 3, 2, 4, 5, 3,5};  
	
		  boolean b[] =new boolean[arr.length];
		  System.out.print("These Elements are Dupicates : ");
		  for(int i=0;i<arr.length;i++) {
			  int count=0;
			  if(b[i]==false) {
				  for(int j=i+1;j<arr.length;j++) {
					  if(arr[i]==arr[j]) {
						  count++;
						  b[j]=true;
					  }
				  }
				  if(count>0) {
					  System.out.print(arr[i]+"  ");
				  }
			  }
		  }  
		
	
	}

}
