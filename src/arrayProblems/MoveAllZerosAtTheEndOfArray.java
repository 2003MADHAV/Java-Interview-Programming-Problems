package arrayProblems;

import java.util.Arrays;

public class MoveAllZerosAtTheEndOfArray {

	public static void main(String[] args) {
		int[] arr= {5,0,3,0,6,0,4,0};
		int count=0;
		System.out.println("Before Moving zero's at the end of Array : "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(arr[i] !=0) {
				arr[count]=arr[i];
				count++;
			}
		}
		while(count<arr.length) {
			arr[count]=0;
			count++;
		}
		System.out.println("After Moving zero's at the end of Array : "+Arrays.toString(arr));
	}

}
