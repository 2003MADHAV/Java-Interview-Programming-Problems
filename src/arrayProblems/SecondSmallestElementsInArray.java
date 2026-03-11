package arrayProblems;

public class SecondSmallestElementsInArray {

	public static void main(String[] args) {
		int[] arr= {3,12,9,13,55,8,23,2,34,11,10};
		int smallest=arr[0];
		int secondSmallest=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondSmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]<secondSmallest && arr[i] != smallest) {
				secondSmallest=arr[i];
		}
			
		}
		System.out.println(secondSmallest);
	}
}
