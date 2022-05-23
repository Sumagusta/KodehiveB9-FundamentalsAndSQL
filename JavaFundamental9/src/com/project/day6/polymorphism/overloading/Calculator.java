package com.project.day6.polymorphism.overloading;

public class Calculator {
	
	public static int penjumlahan(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public static double penjumlahan(int a, double b) {
		double result = a + b;
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(penjumlahan(4, 5.9));	
		
	}

}
