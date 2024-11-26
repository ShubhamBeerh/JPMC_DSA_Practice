package com.amazon.dsa.practice.AmazonPractice;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

		printSpiral(arr, arr.length, arr[0].length);
	}
	
	public static void printSpiral(int[][] arr, int m, int n) {
		int top=0, left=0, right=n-1, bottom=m-1;
		
	while(left<=right && top<=bottom) {
		
			for (int i = left; i <= right; i++ ) {
				System.out.print(arr[top][i] + ",");
			}
			top++;
			
			for(int j = top; j <=bottom; j++) {
				System.out.print(arr[j][right] + ",");
			}
			right--;
			
			if(left<=right) {
				for(int k = right; k>=left; k--) {
					System.out.print(arr[bottom][k] + ",");
				}
				bottom--;
			}
			if(top<=bottom) {
				for(int r = bottom; r>=top; r--) {
					System.out.print(arr[r][left] + ",");
				}
				left++;
			}
		}
	}

}
