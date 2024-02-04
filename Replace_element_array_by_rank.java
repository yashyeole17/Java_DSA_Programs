package practice;

import java.util.Arrays;

public class Replace_element_array_by_rank {

	static void changeArray(int[] arr) {
		int newArr[] = Arrays.copyOfRange(arr, 0, arr.length);
		Arrays.sort(newArr);
		

		System.out.println("Before sort: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("");
		

		System.out.println("After sort: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
		System.out.println("");
		System.out.println("");

		System.out.println("Given array As per rank: ");
			
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<newArr.length; j++) {
				if(newArr[j] == arr[i]) {
					arr[i] = j+1;
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 100, 2, 70, 12 , 90};
		changeArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}
