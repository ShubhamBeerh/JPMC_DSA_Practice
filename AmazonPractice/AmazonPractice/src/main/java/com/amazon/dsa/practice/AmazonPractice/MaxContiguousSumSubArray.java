package com.amazon.dsa.practice.AmazonPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class MaxContiguousSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        System.out.println("Maximum Contiguous Subarray is :: " + Arrays.toString(getMaxContiguousSumSubArray(arr)));
    }
    
    public static int[] getMaxContiguousSumSubArray(int[] arr) {
    	int maxCurrSum = arr[0];
    	int maxGlobalSum = arr[0];
    	List<Integer> maxSubArrListCurr = new ArrayList<>(arr[0]);
    	List<Integer> maxSubArrListGlobal = new ArrayList<>(arr[0]);
    	
    	for(int i = 1; i < arr.length; i++) {
        	if(arr[i] > Math.addExact(arr[i], maxCurrSum)) {
    			maxCurrSum = arr[i];
    			maxSubArrListCurr.removeAll(maxSubArrListCurr);
    		} else {
    			maxCurrSum = Math.addExact(maxCurrSum, arr[i]);
    		}
        	maxSubArrListCurr.add(arr[i]);
        	
    		if(maxGlobalSum < maxCurrSum) {
    			maxGlobalSum = maxCurrSum;
    			maxSubArrListGlobal.removeAll(maxSubArrListGlobal);
    			maxSubArrListGlobal.addAll(maxSubArrListCurr);
    		} 
    	}
    	return maxSubArrListGlobal.stream().mapToInt(Integer::intValue).toArray();
    }
}
