package com.project.day7.bahas.exception;

public class ExceptionHandlingTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[3];
		
		// CheckedExeption
	//	Scanner scan = new Scanner(System.in);

		try {
			
			for (int i = 0; i <= a.length; i++) {
				a[i] = i;
			}
			
			// unchecked exception
			int b = 5 / 0;
			System.out.println(b);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index jumlah array yang di tampilkan melebihi batas, max : " + a.length);
		} catch (ArithmeticException e) {
			System.out.println("Tidak boleh dibagi 0");
		} finally {
			System.out.println("Syntax ini rawan error");
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
