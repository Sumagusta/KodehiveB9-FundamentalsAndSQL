package com.project.day3.array;

public class Array2D {

	public static void main(String[] args) {
		
		int baris = 5;
		int kolom = 3;
									// baris[] // kolom[]
		String[][] kontrakan = new String[baris][kolom];

		kontrakan[0][0] = "Dona";
		kontrakan[0][1] = "Kamar no 15";
		kontrakan[0][2] = "1.2 jt";

		kontrakan[1][0] = "Doni";
		kontrakan[1][1] = "Kamar no 15";
		kontrakan[1][2] = "1.2 jt";

		kontrakan[2][0] = "Donu";
		kontrakan[2][1] = "Kamar no 15";
		kontrakan[2][2] = "1.2 jt";

		kontrakan[3][0] = "Dono";
		kontrakan[3][1] = "Kamar no 15";
		kontrakan[3][2] = "1.2 jt";

		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.println(kontrakan[i][j]);
			}
			System.out.println();
		}
	}
}
