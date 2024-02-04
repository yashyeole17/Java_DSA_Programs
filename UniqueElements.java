package practice;

import java.util.Arrays;

public class UniqueElements {

	public static void countFreq(int []arr, int n) {
		boolean visited[] = new boolean[n];
		Arrays.fill(visited, false);
		
		for(int i=0; i<n; i++) {
			if(visited[i] == true) {
				continue;
			}
			int count = 1;
			
			for(int j= i+1; j<n; j++){
				if(arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			if(count == 1) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unique elements: ");
		int arr[] = {10, 30, 40, 20, 10, 20, 50, 10};
		int n = arr.length;
		countFreq(arr, n);
	}

}
