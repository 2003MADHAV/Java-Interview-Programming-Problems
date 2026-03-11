package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size Of Array :");
		int size=sc.nextInt();
		System.out.println("Enter The Array Elements of size  "+size+" :");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		/*
		 * for(int i=arr.length-1;i>=0;i--) { System.out.println(arr[i]); }
		 */
		 int i=0;
		 int j=arr.length-1;
		 while(i<j) {
			 int temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			 i++;
			 j--;
		 }
		System.out.println(Arrays.toString(arr));
	}

}
