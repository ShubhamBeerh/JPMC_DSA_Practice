package com.jpmc.dsa.practice;

import java.util.Scanner;

public class AlternateStringsMerge {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first String :: ");
			String str1 = sc.next();
			System.out.println("Enter second String :: ");
			String str2 = sc.next();
			String mergedString = mergedString(str1, str2);
			System.out.println("The merged String is :: " + mergedString);
		}

	}
	
	private static String mergedString(String firstString, String secondString) {
		// abc + pqr = apbqcr
		// abc + pq = apbqc
		// ab + pqr = apbqr
		int lengthOfFirstString = firstString.length();
		int lengthOfSecondString = secondString.length();
		int lowerStringLength = lengthOfFirstString <= lengthOfSecondString ? lengthOfFirstString : lengthOfSecondString;
		StringBuilder strBuilder = new StringBuilder();
		int i=0;
		while(i < lowerStringLength) {					//T(n) = O(n)
			strBuilder.append(firstString.charAt(i));
			strBuilder.append(secondString.charAt(i));
			i++;
		}
		
		while(i < firstString.length()) {
			strBuilder.append(firstString.charAt(i));   //T(n) = O(n)
			i++;
		}
		
		while(i < secondString.length()) {
			strBuilder.append(secondString.charAt(i));   //T(n) = O(n)
			i++;
		}
		
		//Overall Time Complexity = O(n)
		
		return strBuilder.toString();
	}

}
