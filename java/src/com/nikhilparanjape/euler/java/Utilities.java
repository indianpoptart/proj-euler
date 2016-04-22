package com.nikhilparanjape.euler.java;

/*
 * A bunch of utilities
 * 
 * @author Nikhil Paranjape
 */

public class Utilities {
		public Utilities(){
			
		}
		// Returns the reverse of the given string.
		public static String reverse(String s) {
			return new StringBuilder(s).reverse().toString();
		}
		
		// Tests whether the given string is a palindrome.
		public static boolean isPalindrome(String s) {
			return s.equals(reverse(s));
		}
		
		// Tests whether the given integer is a palindrome in decimal (base 10).
		public static boolean isPalindrome(int x) {
			return isPalindrome(Integer.toString(x));
		}
		// Tests whether the given integer is prime.
		public static boolean isPrime(int x) {
			if (x < 0)
				return false;
			if (x == 0 || x == 1)
				return false;
			else if (x == 2)
				return true;
			else {
				if (x % 2 == 0)
					return false;
				for (int i = 3, end = (int) Math.sqrt(x); i <= end; i += 2) {
					if (x % i == 0)
						return false;
				}
				return true;
			}
		}
}
