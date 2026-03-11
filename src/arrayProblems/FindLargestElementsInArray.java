package arrayProblems;

public class FindLargestElementsInArray {

	public static void main(String[] args) {
		int[] arr= {9,12,5,7,23,45,7,21,45,67};
		int largestElement=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largestElement) {
				largestElement=arr[i];
			}
		}
		System.out.println("The Largest Elemetns present in array is : ");
		System.out.println(largestElement);

	}

}
