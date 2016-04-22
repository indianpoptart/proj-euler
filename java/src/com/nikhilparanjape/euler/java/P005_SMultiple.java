package com.nikhilparanjape.euler.java;

import java.math.BigInteger;

/*
 * 	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	
	@author Nikhil Paranjape
 */

public class P005_SMultiple {

	public static void main(String[] args) {
		BigInteger allLcm = BigInteger.ONE;
		for (int i = 1; i <= 20; i++){
			allLcm = lcm(BigInteger.valueOf(i), allLcm);
		}
		System.out.println(allLcm);

	}
	private static BigInteger lcm(BigInteger x, BigInteger y) {
		return x.divide(x.gcd(y)).multiply(y);
	}

}
