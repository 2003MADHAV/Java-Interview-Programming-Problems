package arrayProblems;

public class PrintEffeicinecyOfArrayElements1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,2,4,5,4,6,7,6,2,4,2};
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			boolean allreadyCounted=false;
			// check if element appeared before
			for(int k=0;k<i;k++) {
				if(arr[i]==arr[k]) {
					allreadyCounted=true;
					break;
				}
			}
			
			if(allreadyCounted) {
				continue;
			}
			// count frequency
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			 System.out.println(arr[i] + "  " + count);
			
		}
	}
}
