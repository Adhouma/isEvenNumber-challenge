package com.learnJava;

public class Main {
	/**
	 * Create a method called isEvenNumber that take a parameter number of type int
	 * Its purpose is to determine if the argument passed to the method is an even number or not
	 * return true if even number otherwise return false 
	 * 
	 * Make it also record the total numbers of even numbers found and break once 5 are found
	 * Display all even numbers from 0 to 50
	 * Even number: Any integer that can be divided exactly by 2.
	 */
	public static void main(String[] args) {
		for(int i = 0; i <= 50; i++) {
			if(!isEvenNumber(i)) {
				continue;
			}
			System.out.println(i + " is Even an number " + isEvenNumber(i));
		}
	}
	
	public static boolean isEvenNumber(int number) {
		while(number % 2 == 0) {
			return true;
		}
		return false;
	}

}
