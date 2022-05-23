package com.project.day7.bahas.exception;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsExceptionHandling {

	public int divideNum(int m, int n) throws IOException {
		int div = m / n;
		return div;
	}
	
	public void callDivide() {
		try {
			divideNum(40, 0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// main method
	public static void main(String[] args) throws IOException {
		ThrowsExceptionHandling obj = new ThrowsExceptionHandling();
		
			System.out.println(obj.divideNum(45, 0));
			
			System.out.println("\nNumber cannot be divided by 0");

		System.out.println("Rest of the code..");
	}

}
