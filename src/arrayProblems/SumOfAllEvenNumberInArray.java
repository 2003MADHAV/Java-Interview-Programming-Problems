package arrayProblems;

public class SumOfAllEvenNumberInArray {

	public static void main(String[] args) {
		int[] arr= {2,7,8,12,13,35,42,88,48};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of Even Number Present in array are : "+sum);
		
	}

}
