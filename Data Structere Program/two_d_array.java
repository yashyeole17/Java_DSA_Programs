
import java.util.*;

public class two_d_array {
    public static void main(String args[] ) throws Exception {
    	
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Enter row size of array: ");
        int row = sc.nextInt();
        
        System.out.print("Enter column size of array: ");
        int  col = sc.nextInt();
        
        int[][] arr= new int[row][col];
        
        for(int i =0; i< row; i++) {
        	for(int j = 0; j < col; j++) {
        		arr[i][j] = sc.nextInt();
        	}
        }
        int sum = 0;
        for(int i =0; i < row; i++) {
        	for(int j = 0; j < col; j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        System.out.println();
        }	
        */
        
        int[][] arr1 = {{1,2,3}, {4,5,6}};
        for(int i =0; i < 2; i++) {
        	for(int j = 0; j < 3; j++) {
        		System.out.print(arr1[i][j]+" ");
        	}
        System.out.println();
        }
    }
}




















