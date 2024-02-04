package practice;

public class CircularRotation_Array {
	
	public static void leftRotate(int[] arr, int pos, int n) {
		for(int i=0; i<pos; i++) {
			leftRotation(arr, n);
		}
	}
	static void leftRotation(int arr[], int n) {
		int temp = arr[0];
		for(int i=0; i<n-1; i++) {
			arr[i] = arr[i+1];
		}	
		arr[n-1] = temp;
	}
	static void printArr(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	   
	public static void main(String[] args) {
		   int arr[] = {1,2,3,4,5};
		   
		   int position = 2;
		   int n = arr.length;
		   
		   System.out.println("Before Rotaion: ");
		   printArr(arr, n);
		   
		   System.out.println("");
		   
		   leftRotate(arr, position, n);
		   System.out.println("After Rotaion: ");
		   printArr(arr, n);
	   }
}
