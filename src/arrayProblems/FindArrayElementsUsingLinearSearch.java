package arrayProblems;

public class FindArrayElementsUsingLinearSearch {

	public static void main(String[] args) {
		int[] arr= {12,10,9,32,54,34,6,7,45};
		int key=32;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				count++;
				break;
			}
		}
		if(count>0) {
			System.out.println("Element Found In Given Array");
		}
		else {
			System.out.println("Element Not Fount In Given Array");
		}

	}

}
