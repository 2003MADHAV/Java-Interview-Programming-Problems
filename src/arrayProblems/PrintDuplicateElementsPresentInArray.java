package arrayProblems;

public class PrintDuplicateElementsPresentInArray {

	public static void main(String[] args) {
		  int[] arr={1, 2, 3, 2, 4, 5, 3};
		  System.out.print("Dupicate Elements present In Array are : ");
	       for(int i=0;i<arr.length;i++){
	           for(int j=1+i;j<arr.length;j++){
	               if(arr[i]==arr[j]){
	                   System.out.print(arr[j]+"  ");
	                   break;
	               }
	           }
	       }

	}

}
