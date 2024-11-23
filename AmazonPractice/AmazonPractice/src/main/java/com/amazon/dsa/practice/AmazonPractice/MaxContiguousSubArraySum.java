package com.amazon.dsa.practice.AmazonPractice;

public class MaxContiguousSubArraySum {

	public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        System.out.println("Maximum Contiguous Subarray is :: " + getMaxContiguousSumSubArray(arr));
	}
	
    public static int getMaxContiguousSumSubArray(int[] arr) {
    	int maxCurrSum = arr[0];
    	int maxGlobalSum = arr[0];
    	
    	for(int i = 1; i < arr.length; i++) {
    		maxCurrSum = Math.max(arr[i], Math.addExact(arr[i], maxCurrSum));
    		maxGlobalSum = Math.max(maxGlobalSum, maxCurrSum);
    	}
    	return maxGlobalSum;
    }

}
