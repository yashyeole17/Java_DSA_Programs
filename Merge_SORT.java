package practice;

public class Merge_SORT {

	public static void main(String[] args) {
		int[] arr = {12, 8, 4, 14, 36, 64};
		
		System.out.println("Original Array: ");
		printArray(arr);
		
		
		mergeSort(arr, 0, arr.length-1);
		printArray(arr);
	}


	private static void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = (left + right)/2;
			
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
		}
	}
	
	private static void merge(int[] arr, int left,int mid, int right) {
		
		int sizeLeft = mid -left+1;
		int sizeRight = right - mid;
		
		int[] leftArray = new int[sizeLeft];
		int[] rightArray = new int[sizeRight];
		System.arraycopy(arr, left, leftArray, 0, sizeLeft);
        System.arraycopy(arr, mid + 1, rightArray, 0, sizeRight);

        // Merge the two arrays
        int i = 0, j = 0, k = left;
        while (i < sizeLeft && j < sizeRight) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray, if any
        while (i < sizeLeft) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray, if any
        while (j < sizeRight) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

	}


	private static void printArray(int[] arr) {
		for(int val: arr) {
			System.out.print(val+" ");
		}
		System.out.println("");
	}
}
