package com.amazon.dsa.practice.AmazonPractice;

import java.util.Arrays;

public class JugglingAlgorithmForArrayRotation {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 25;
        
        System.out.println(Arrays.toString(juggleRotateArray(arr, d)));
        
        // TODO: T(C) = O(n) , S(C) = O(1)

	}
	
	public static int[] juggleRotateArray(int[] arr, int d) {
		/** TODO: Idea -> 
		 * 1) Get number of cycles by gcd(n,d)
		 * 2) loop through the number of cycles as an outer loop.
		 * 3) Keep a track of currIndex = i, and nextIndex and startElement = arr[i];
		 * 4) Do a while(true) loop which will end once the nextIndex = i; 
		 * 5) Inside the inner loop for two types of rotations:
		 * 	5.1) Left Rotation = nextIndex = (currIndex + d ) % n;
		 *  5.2) Right Rotation = nextIndex = (currIndex - d + n) % n;
		 */
		int n = arr.length;
		
		d = d % n; //TODO: This is for removing redundant rotations.
		
		int cycles = gcd(n,d);
		
		for (int i = 0; i < cycles; i++) {
			int startElement = arr[i];
			int currIndex = i, nextIndex;
			while(true) {
				nextIndex = (currIndex + d) % n;
				if(nextIndex == i)
					break;
				arr[currIndex] = arr[nextIndex];
				currIndex = nextIndex;
			}
			arr[currIndex] = startElement;
		}
		return arr;
	}
	
	public static int gcd(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

}
