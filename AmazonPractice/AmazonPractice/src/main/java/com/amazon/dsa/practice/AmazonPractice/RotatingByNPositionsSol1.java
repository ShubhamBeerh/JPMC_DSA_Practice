package com.amazon.dsa.practice.AmazonPractice;

import java.util.Arrays;

public class RotatingByNPositionsSol1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 25;
        
        System.out.println(Arrays.toString(rotateArray(arr, d)));
        
        // TODO: T(C) = O(n) , S(C) = O(n)
	}
	
	public static int[] rotateArray(int[] arr, int d) {
		int n = arr.length;
		int[] tempArr = new int[n];
		for(int i=0; i<n; i++) {
			tempArr[Math.floorMod(i-d+n, n)] = arr[i];
		}
		return tempArr;
	}

}
