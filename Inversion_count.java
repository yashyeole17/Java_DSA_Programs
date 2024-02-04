package practice;

public class Inversion_count {
	/* 
	 	It compares each pair of elements and increments the inv_count if the condition 
	 	arr[i]>arr[j] is satisfied.
	 */
	public static int CountInversion(int arr[], int n) {
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					count++;
					System.out.println(arr[i] +" > "+arr[j]);
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {1,6,4,5};
		int n = arr.length;
		int count = CountInversion(arr, n);
		System.out.println("Inversion of Count are: "+count);
	}
}
