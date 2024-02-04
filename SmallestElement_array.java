package practice;

public class SmallestElement_array {
	public static void main(String []a) {
		int arr[] = {10,20,40,23,56,6,23,99};
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Smallest Element: "+min);
	}
}
