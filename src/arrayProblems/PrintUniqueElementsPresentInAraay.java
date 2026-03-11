package arrayProblems;

public class PrintUniqueElementsPresentInAraay {

	public static void main(String[] args) {
		  int arr[] = {1, 2, 3, 2, 4, 5, 3};

	      System.out.print("Unique elements Present in array are :  ");
	      
	      for(int i=0;i<arr.length;i++) {
	    	  int count=0;
	    	  for(int j=0;j<arr.length;j++) {
	    		  if(arr[i]==arr[j]) {
	    			  count++;
	    		  }
	    	  }
	    	  if(count==1) {
    			  System.out.print(arr[i]+"  ");
    		  }
	      }

	}

}
