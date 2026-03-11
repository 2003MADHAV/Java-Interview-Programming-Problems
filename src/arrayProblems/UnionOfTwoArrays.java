package arrayProblems;

public class UnionOfTwoArrays {

	public static void main(String[] args) {
		 int[] a = {1,2,3};
	     int[] b = {3,4,5};
	     System.out.print("The Unoin Of Given Array is :  ");
	     for(int i=0;i<a.length;i++) {
	    	 System.out.print(a[i]+"  ");
	     }
	     for(int i=0;i<b.length;i++) {
	    	 boolean present=false;
	    	 
	    	 for(int j=0;j<a.length;j++) {
	    		 if(a[j]==b[i]) {
	    			 present=true;
	    			 break;
	    		 }
	    	 }
	    	 if(!present){
	                System.out.print(b[i] + " ");
	            }
	     } 
	}

}
