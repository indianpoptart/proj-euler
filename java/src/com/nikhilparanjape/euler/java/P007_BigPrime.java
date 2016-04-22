package com.nikhilparanjape.euler.java;

/*
 * 
 * 	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

	What is the 10 001st prime number?
	
	@author Nikhil Paranjape
 */

public class P007_BigPrime {

	public static void main(String[] args) {
		for (int i = 2, count = 0; ; i++) {
			if (Utilities.isPrime(i)) {
				count++;
				if (count == 10001)
					System.out.println(i);
			}
		}

	}

}
