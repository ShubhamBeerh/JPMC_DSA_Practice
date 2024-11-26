package com.amazon.dsa.practice.AmazonPractice;

import java.util.Arrays;

public class ReversalAlgorithmForArrayRotation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 25;
        
        System.out.println(Arrays.toString(reversalRotateArray(arr, d)));
        
        // TODO: T(C) = O(n) , S(C) = O(1)

	}
	
	public static int[] reversalRotateArray(int[] arr, int d) {
		/** TODO:
		 * 1) Divide the array of length n into 2 parts i.e. n - d and d
		 * 2) Reverse the n-d subArray
		 * 3) Reverse the d subArray
		 * 4) Reverse the whole Array
		 */
		int n = arr.length;
		d = d % n;

// THIS IS FOR RIGHT REVERSAL
//		arr = reverseArray(arr, 0, n-d-1);
//		arr = reverseArray(arr, n-d, n-1);
//		arr = reverseArray(arr, 0, n-1);
		
// THIS IS FOR LEFT REVERSAL
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, n-1);
		reverseArray(arr, 0, n-1);
		return arr;
		
	}
	
	public static int[] reverseArray(int[] arr, int startIndex, int endIndex) {
		while(startIndex < endIndex) {
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
//		System.out.println(Arrays.toString(arr));
		return arr;
	}

}
