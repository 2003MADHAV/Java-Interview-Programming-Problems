package arrayProblems;

import java.util.Arrays;

public class ReverseSecondHalfOfArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Before Reversing Half Of the Array : "+Arrays.toString(arr));
	
		int l=arr.length;
		int mid=l/2;
		int i=mid-1;
		int j=l-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println("After Reversing Half Of the Array : "+Arrays.toString(arr));
		
	}

}
