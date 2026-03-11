package arrayProblems;

import java.util.Arrays;
public class SortArrayUsingBubbleSort {
	public static void main(String[] args) {
		int[] arr= {50,10,80,20,60,90,40,70,100,30};
		System.out.println("Before Sorting Array :  "+Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					//Swap arr[j] and arr[j+1]
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		 // Print sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

	}
}
