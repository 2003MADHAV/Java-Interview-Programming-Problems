package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class PrintPrimeNumberPresentInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size OF an Array : ");
		int size=sc.nextInt();
		System.out.println("Enter Array Elements : ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered Elemtns are : "+Arrays.toString(arr));
		System.out.print("Prime Number in Entered Array are :  ");
		
		for(int j=0;j<arr.length;j++) {
			int count =0;
			
			for(int k=1;k<=arr[j];k++) {
				if(arr[j]%k==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(arr[j]+"  ");
			}
			
		}
	}

}
