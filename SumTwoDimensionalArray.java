package practice;

import java.util.Scanner;

public class SumTwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter rows: ");
		int row = sc.nextInt();
		
		System.out.print("Enter coloumn: ");
		int col = sc.nextInt();
		
		int a1[][] = new int[row][col];
		int a2[][] = new int[row][col];

		System.out.println("Enter data into first matrix: ");
		for(int i=0; i<row; i++) {
			for(int  j=0; j<col; j++) {
				int data = sc.nextInt();
				a1[i][j] = data;

			}
		}
		System.out.println("Enter data into Second matrix: ");
		for(int i=0; i<row; i++) {
			for(int  j=0; j<col; j++) {
				int data = sc.nextInt();
				a2[i][j] = data;
			}
		}
		System.out.println("Addition of both matrices: ");
		int sum[][] = { {0,0,0},{0,0,0},{0,0,0} };
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum[i][j] = a1[i][j] + a2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
