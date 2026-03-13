package arrayProblems;

public class PrintEffeicinecyOfArrayElements {

	public static void main(String[] args) {
		int[] arr= {1,2,3,2,4,5,4,6,7,6,2,4,2};
		
		boolean[] b=new boolean[arr.length];
		
		System.out.println("Elements   Effeciency");
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(b[i]==false) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						b[j]=true;
					}
				}
				System.out.println(arr[i]+"  	    "+count);
			}
		}

	}

}
