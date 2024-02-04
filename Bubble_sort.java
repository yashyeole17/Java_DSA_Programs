package practice;

import java.util.Scanner;

public class Bubble_sort {

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp =0;
		
		for(int i=0; i<n; i++) {
			for(int j=1; j<(n-i); j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {3,60,35,2,45,234,4};
		System.out.println("Before Sorting:");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		bubbleSort(arr);
		
		System.out.println("After Sorting:");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}	
		sc.close();
	}
}
