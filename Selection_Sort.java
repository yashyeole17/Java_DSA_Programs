package practice;

public class Selection_Sort {

	public static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int index = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[index]) {
					index = j;
				}				
			}
			int smallNo = arr[index];
			arr[index] = arr[i];
			arr[i] = smallNo;
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {9,14,3,2,43,11,58,22};  
		 
		 System.out.println("Before Sorting: ");
		 for(int i:arr) {
			 System.out.print(i+" ");
		 }
		 System.out.println();
		 
		 selectionSort(arr);
		 System.out.println("After Sorting: ");
		 for(int i:arr) {
			 System.out.print(i+" ");
		 }	 
	}
}
