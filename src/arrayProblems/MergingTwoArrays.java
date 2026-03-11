package arrayProblems;

import java.util.Arrays;

public class MergingTwoArrays {

	public static void main(String[] args) {
		int[] a1= {1,2,3,4,5};
		int[] a2= {6,7,8,9,10};
		int[] result=new int[a1.length+a2.length];
		
		for(int i=0;i<a1.length;i++) {
			result[i]=a1[i];
		}
		
		for(int j=0;j<a2.length;j++) {
			result[a1.length+j]=a2[j];
		}
		System.out.println(Arrays.toString(result));

	}

}
