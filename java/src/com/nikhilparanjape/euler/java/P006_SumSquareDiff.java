package com.nikhilparanjape.euler.java;

/*
 * 	The sum of the squares of the first ten natural numbers is,

	12 + 22 + ... + 102 = 385
	The square of the sum of the first ten natural numbers is,

	(1 + 2 + ... + 10)2 = 552 = 3025
	Hence the difference between the sum of the squares of the 
	first ten natural numbers and the square of the sum is 3025 - 385 = 2640.

	Find the difference between the sum of the squares of the 
	first one hundred natural numbers and the square of the sum.
	
	sum  = N(N + 1) / 2.
	sum2 = N(N + 1)(2N + 1) / 6.
 * 
 * 	@author Nikhil Paranjape
 */

public class P006_SumSquareDiff {

	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;
		for(int i = 1; i <= 100; i++){
			sum2 += i * i;
			sum += i;
		}
		System.out.println((sum * sum) - sum2);
	}

}
