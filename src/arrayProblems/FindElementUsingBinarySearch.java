package arrayProblems;

import java.util.Arrays;

public class FindElementUsingBinarySearch {

	public static void main(String[] args) {
		int[] arr= {50,10,80,20,60,90,40,70,100,30};
		Arrays.sort(arr);
		int i=0,j=arr.length-1,count=0,key=60;
		while(i<=j) {
			int mid=(i+j)/2;
			if(key==arr[mid]) {
				count++;
				break;
			}
			else if(key>arr[mid]) {
				i=mid+1;
			}
			else if(key<arr[mid]) {
				j=mid-1;
			}
		}
		if(count>0) {
			System.out.println("Element is Found In Given Array");
		}
		else {
			System.out.println("Element is Not Found In Given Array ");
		}
	}
}
