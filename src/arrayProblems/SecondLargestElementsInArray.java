package arrayProblems;

public class SecondLargestElementsInArray {

	public static void main(String[] args) {
		int[] arr= {3,12,9,13,55,8,23,2,34,11,10};
		int largest=arr[0];
		int secondLargest=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondLargest && arr[i] != largest) {
					secondLargest=arr[i];
			}
		}
		System.out.println("Secnond Largest Elements: ");
		System.out.println(secondLargest);

	}

}
