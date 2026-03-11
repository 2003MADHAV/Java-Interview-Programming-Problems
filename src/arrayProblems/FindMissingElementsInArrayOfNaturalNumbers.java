package arrayProblems;

public class FindMissingElementsInArrayOfNaturalNumbers {

	public static void main(String[] args) {
		int[] arr= {1,3,7,2,8,6,4};
		int num=8;
		
		int expectedSum=num*(num+1)/2;
		int actualSum=0;
		for(int i=0;i<arr.length;i++) {
			actualSum=actualSum+arr[i];
		}
		int missingNum=expectedSum-actualSum;
		System.out.println("Missing Number In Given Array Of  Natural Number:  "+missingNum);
		
	}

}
