package arrayProblems;

public class PrintUniqueElementsPresentInAraay {

	public static void main(String[] args) {
		
		  int arr[] = {1, 2, 3, 2, 4, 5, 3};
		  boolean b[] =new boolean[arr.length];
		  
		  for(int i=0;i<arr.length;i++) {
			  int count=0;
			  if(b[i]==false) {
				  for(int j=i+1;j<arr.length;j++) {
					  if(arr[i]==arr[j]) {
						  count++;
						  b[j]=true;
					  }
				  }
				  if(count==0) {
					  System.out.println(arr[i]);
				  }
			  }
		  }
		    
	/*
	      System.out.print("Unique elements Present in array are :  ");
	       int arr[] = {1, 2, 3, 2, 4, 5, 3};
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
	*/
	}

}
