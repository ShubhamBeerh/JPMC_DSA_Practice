package com.jpmc.dsa.practice;

import java.util.Arrays;

public class ShiftZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,0,2,0,7,0,3};
		int[] arr1 = {0,0,0,0,0,7,0,3};
		int[] arr2 = {1,5,0,0,0,7,0,3};
		int[] arr3 = {1,5,4,6,8,7,9,3};
//		shiftZerosToEndNormal(arr1);
		shiftZerosToEndOptimizedFirst(arr3);
		System.out.println(Arrays.toString(arr3));	
	}
	
	private static void shiftZerosToEndNormal(int[] arr) {        //T(C) = O(n^2)
		for(int i=0; i<arr.length-1; i++) {				
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==0 && arr[j]!=0) {
					int k = arr[i];
					arr[i] = arr[j];
					arr[j] = k;
					break;
				}
			}
		}		
	}
	
	private static void shiftZerosToEndOptimizedFirst(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {		//T(C) = O(n)
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
	}

}
