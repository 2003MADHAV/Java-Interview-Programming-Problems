package arrayProblems;

public class FindSmallestElementsPresntInArray {

	public static void main(String[] args) {
		int[] arr= {9,12,5,7,23,45,7,21,45,67};
		int smallestElement=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallestElement) {
				smallestElement=arr[i];
			}
		}
		System.out.println("Smallest Elements Presnt in Array is : "+smallestElement);
	}

}
