package com.project.day2;

public class StringFormat {

	public static void main(String[] args) {

		int angka  = 20;
		
		String format1 = String.format("format string : %s", angka);
		String format2 = String.format("format octal number : %o", angka);
		
		System.out.println(format2);
		
		// printf output value nya tidak bisa digunakan ulang
		System.out.printf("%10s", angka);
	}

}
