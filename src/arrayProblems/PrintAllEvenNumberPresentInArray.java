package arrayProblems;

public class PrintAllEvenNumberPresentInArray {

	public static void main(String[] args) {
		int[] arr= {2,7,8,12,13,35,42,88,48};
		System.out.println("Even Number Present in array are : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}

	}

}
