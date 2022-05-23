package com.project.day3.loopcondition;

public class IfElse {

	public static void main(String[] args) {

		int usia = 12;

		if (usia >= 3 && usia <= 5) { // negasi AND &&, Kedua kondisi harus TRUE
			System.out.println("PAUD");
		} else if (usia == 6) {
			System.out.println("TK");
		} else if (usia > 6 || usia < 12) { // negasi OR ||, Salah satu kondisi TRUE 
			System.out.println("SD");
		} else if (usia == 0) {
			System.out.println("Belum lahir");
		} else {
			System.out.println("Tidak Terdaftar");
		}

	}

}
