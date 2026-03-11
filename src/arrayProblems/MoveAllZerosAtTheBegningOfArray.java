package arrayProblems;

import java.util.Arrays;

public class MoveAllZerosAtTheBegningOfArray {

	public static void main(String[] args) {
		int[] arr= {4,0,5,0,0,3,7,0,9};
		int count=arr.length-1;
		System.out.println("Before Moving zero's at the end of Array : "+Arrays.toString(arr));
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i] != 0) {
				arr[count]=arr[i];
				count--;
			}
		}
		while(count>=0) {
			arr[count]=0;
			count--;
		}
		System.out.println("After Moving zero's at the end of Array : "+Arrays.toString(arr));
	}

}
