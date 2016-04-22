package com.nikhilparanjape.euler.java;

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

	Find the sum of all the multiples of 3 or 5 below 1000.
	
	@author Nikhil Paranjape
 */

public class P001_Multiples {

	public static void main(String[] args) {
		int sum=0;
		  for (int n=0;n<1000;n+=3)
		  {
		    sum+=n;
		  }
		  for (int n=0;n<1000;n+=5)
		  {
		    if (n%3!=0) // Don't pick up the 3's twice
		      sum+=n;
		  }
        System.out.println(sum);

	}

}
