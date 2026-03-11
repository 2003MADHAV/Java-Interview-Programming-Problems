package arrayProblems;

public class CheckArrayIsSorted {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		boolean sorted=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				sorted=false;
				break;
			}
		}
		 if(sorted)
	            System.out.println("Given Array is Sorted");
	        else
	            System.out.println("Given Array is Not Sorted");

	}

}
