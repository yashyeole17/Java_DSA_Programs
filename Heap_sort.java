package practice;

public class Heap_sort {

	public static void sort(int[] arr) {
		int n = arr.length;
		
		for(int i = n/2-1; i >= 0; i--) {
			heapify(arr, n, i);
		}
		for(int i = n-1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr, i, 0);
		}
	}
	
	static void heapify(int arr[], int n, int i) {
		int largest = i;
		int l = 2*i+1;  //left
		int r = 2*i+2;	//right
		
		if(l < n && arr[l] > arr[largest]) {
			largest = l;
		}
		if(r < n && arr[r] > arr[largest]) {
			largest = r;
		}
		if(largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			
			heapify(arr, n, largest);
		}
		
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 11, 13,88, 5, 6, 7};
		
		System.out.println("Before sorted: ");
		printArray(arr);

		System.out.println();
		sort(arr);
		
		System.out.println("After Heap sorted: ");
		printArray(arr);
		
	}
}
