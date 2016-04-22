package com.nikhilparanjape.euler.java;

/*
 * 	A palindromic number reads the same both ways. 
 * 	The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

	Find the largest palindrome made from the product of two 3-digit numbers.
	
 * 	@author Nikhil Paranjape
 */

public class P004_Palindrome {

	public static void main(String[] args) {
		int maxP = -1;
		Utilities util = new Utilities();
		
		for(int i = 100; i < 1000; i++){
			for(int j = 100; j < 1000; j++){
				int product = i * j;
				if(util.isPalindrome(product) && product > maxP){
					maxP = product;
				}
			}
		}
		System.out.println(maxP);
	}

}
